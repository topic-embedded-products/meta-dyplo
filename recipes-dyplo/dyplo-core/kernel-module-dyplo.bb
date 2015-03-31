DESCRIPTION = "Kernel driver module for TOPIC DYPLO"
MODULE = "dyplo"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=9eef91148a9b14ec7f9df333daebc746"

SRCREV = "f100a27f295d16eb8683d419a5bb0bee7e7398e3"

inherit module gitpkgv

PV = "1+${SRCPV}"
PKGV = "1+${GITPKGV}"
PR = "r1"
S = "${WORKDIR}/git"

GITHUB_TOPIC_URI ?= "git://github.com/topic-embedded-products"
SRC_URI = "${GITHUB_TOPIC_URI}/${PN}"

do_install_append() {
	install -d ${D}/etc
	install -d ${D}/etc/modules-load.d
	echo "${MODULE}" > ${D}/etc/modules-load.d/${MODULE}.conf
}
