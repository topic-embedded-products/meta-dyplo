DESCRIPTION = "Commandline utilities for DYPLO. Also demonstrates how to compile and link with libdyplo."
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=9eef91148a9b14ec7f9df333daebc746"
DEPENDS = "libdyplo"
SRCREV = "6f63fb006bd9de4cf762baa31b76cbab20e5a08b"

inherit autotools pkgconfig gitpkgv

PV = "0+${SRCPV}"
PKGV = "0+${GITPKGV}"
PR = "r0"
S = "${WORKDIR}/git"

SRC_URI = "git://github.com/topic-embedded-products/${PN}.git"
