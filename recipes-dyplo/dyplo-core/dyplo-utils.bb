DESCRIPTION = "Commandline utilities for DYPLO. Also demonstrates how to compile and link with libdyplo."
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=9eef91148a9b14ec7f9df333daebc746"
DEPENDS = "libdyplo"
SRCREV = "09c712f56ffe5cdc0bff2489369cf3100a55ebfd"

inherit autotools pkgconfig gitpkgv

PV = "0+${SRCPV}"
PKGV = "0+${GITPKGV}"
PR = "r0"
S = "${WORKDIR}/git"

SRC_URI = "git://github.com/topic-embedded-products/${PN}.git"
