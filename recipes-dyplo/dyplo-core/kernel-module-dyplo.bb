DESCRIPTION = "Kernel driver module for TOPIC DYPLO"
MODULE = "dyplo"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=9eef91148a9b14ec7f9df333daebc746"

SRCREV = "d93b8c9c6218ceb2a254e100bad8cc7e46f4b0bc"

inherit module gitpkgv

PV = "1.1+${SRCPV}"
PKGV = "1.1+${GITPKGV}"
S = "${WORKDIR}/git"

GITHUB_TOPIC_URI ?= "git://github.com/topic-embedded-products"
SRC_URI = "${GITHUB_TOPIC_URI}/${BPN}"

do_install_append() {
	install -d ${D}/etc
	install -d ${D}/etc/modules-load.d
	echo "${MODULE}" > ${D}/etc/modules-load.d/${MODULE}.conf
}
