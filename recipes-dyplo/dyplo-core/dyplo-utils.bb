DESCRIPTION = "Commandline utilities for DYPLO. Also demonstrates how to compile and link with libdyplo."
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=9eef91148a9b14ec7f9df333daebc746"
DEPENDS = "libdyplo"
SRCREV = "17a822e5db6c06844b77792d9d0be2c477838f07"

inherit autotools pkgconfig gitpkgv

PV = "0+${SRCPV}"
PKGV = "0+${GITPKGV}"
PR = "r0"
S = "${WORKDIR}/git"

SRC_URI = "git://github.com/topic-embedded-products/${PN}.git"
