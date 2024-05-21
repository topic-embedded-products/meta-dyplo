DESCRIPTION = "Kernel driver module for TOPIC DYPLO"
MODULE = "dyplo"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=9eef91148a9b14ec7f9df333daebc746"

SRCREV = "06d9b86659509d1f467ced79cedb7bba1cdf681c"

inherit module gitpkgv

PV = "1.1+${SRCPV}"
PKGV = "1.1+${GITPKGV}"
S = "${WORKDIR}/git"

GITHUB_TOPIC_URI ?= "git://github.com/topic-embedded-products"
SRC_URI = "${GITHUB_TOPIC_URI}/${BPN};protocol=https;branch=linux-6.6-compat"

PACKAGES =+ "dyplo-udev-rules"
FILES:dyplo-udev-rules = "/etc/udev/rules.d"

FILES:${PN} += "/etc/modules-load.d"

RDEPENDS:${PN}-dev = ""
RRECOMMENDS:${PN}-dev = ""

do_install:append() {
	install -d ${D}/etc
	install -d ${D}/etc/modules-load.d
	echo "${MODULE}" > ${D}/etc/modules-load.d/${MODULE}.conf
	install -d ${D}/etc/udev/rules.d
	install -m 644 ${S}/dyplo.rules ${D}/etc/udev/rules.d/
}
