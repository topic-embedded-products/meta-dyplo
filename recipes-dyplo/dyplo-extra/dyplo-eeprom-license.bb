DESCRIPTION = "Dyplo license loader, reads key from EEPROM at startup"
# We don't need libc or gcc or whatever
INHIBIT_DEFAULT_DEPS = "1"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${META_ZYNQ_BASE}/COPYING;md5=751419260aa954499f7abaabaa882bbe"
# Package is machine independent, but each machine is expected to have
# different EEPROM location and offset.
PACKAGE_ARCH = "${MACHINE_ARCH}"
RDEPENDS_${PN} = "dyplo-utils"

S = "${WORKDIR}"

# On topic-miami boards, store the key in the last 8 bytes of the
# EEPROM chip.
EEPROM_FILE = "-o 504 /sys/bus/i2c/devices/1-0050/eeprom"

SRC_URI = "file://init"

inherit update-rc.d

# Set to start at 09, after loading FPGA and (dyplo) modules
INITSCRIPT_NAME = "${BPN}.sh"
INITSCRIPT_PARAMS = "start 9 S ."

do_compile() {
	sed 's!@EEPROM_FILE@!${EEPROM_FILE}!g' ${WORKDIR}/init > ${WORKDIR}/init.sh
	test -s ${WORKDIR}/init.sh
}

FILES_${PN} = "${sysconfdir}"
do_install() {
	install -d ${D}${sysconfdir}/init.d
	install -m 755 ${WORKDIR}/init.sh ${D}${sysconfdir}/init.d/${BPN}.sh
}
