DESCRIPTION = "Commandline utilities for DYPLO. Also demonstrates how to compile and link with libdyplo."
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=9eef91148a9b14ec7f9df333daebc746"
DEPENDS = "libdyplo"
SRCREV = "f24a71c264c03ae36906eec1b4a3acbdcc96c2f6"

inherit autotools pkgconfig gitpkgv

PV = "0+${SRCPV}"
PKGV = "0+${GITPKGV}"
S = "${WORKDIR}/git"

GITHUB_TOPIC_URI ?= "git://github.com/topic-embedded-products"
SRC_URI = "${GITHUB_TOPIC_URI}/${BPN}"
