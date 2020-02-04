DESCRIPTION = "Kernel driver module for TOPIC DYPLO"
MODULE = "dyplo"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=9eef91148a9b14ec7f9df333daebc746"

SRCREV = "e74c10ed7a017b4e73fbf2122b842112b24e549e"

inherit module gitpkgv

PV = "1.1+${SRCPV}"
PKGV = "1.1+${GITPKGV}"
S = "${WORKDIR}/git"

GITHUB_TOPIC_URI ?= "git://github.com/topic-embedded-products"
SRC_URI = "${GITHUB_TOPIC_URI}/${BPN}"

SRC_URI_append_zynqmp = "\
    file://0001-Make-driver-capable-of-configuring-DMA-node-with-64b.patch \
    file://0002-Add-check-and-error-message-to-prohibit-DMA-in-stand.patch \
    "

PACKAGES =+ "dyplo-udev-rules"
FILES_dyplo-udev-rules = "/etc/udev/rules.d"

do_install_append() {
	install -d ${D}/etc
	install -d ${D}/etc/modules-load.d
	echo "${MODULE}" > ${D}/etc/modules-load.d/${MODULE}.conf
	install -d ${D}/etc/udev/rules.d
	install -m 644 ${S}/dyplo.rules ${D}/etc/udev/rules.d/
}
