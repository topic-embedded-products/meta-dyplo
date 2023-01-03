DESCRIPTION = "Library for DYnamic Programmable LOgic configuration"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRCREV = "d19a5b7e350a579cf563bc75f22411ae73b87c4b"

inherit autotools gitpkgv

PV = "2+${SRCPV}"
PKGV = "2+${GITPKGV}"
S = "${WORKDIR}/git"

GITHUB_TOPIC_URI ?= "git://github.com/topic-embedded-products"
SRC_URI = "${GITHUB_TOPIC_URI}/${BPN}"

PACKAGES =+ "${PN}-test ${PN}-demo ${PN}sw-dev ${PN}sw"
FILES:${PN}-test = "${bindir}/test*"
FILES:${PN}-demo = "${bindir}/dyplodemo*"

# Split the software library into its own package
FILES:${PN}sw-dev = "${libdir}/${PN}sw.so \
                     ${libdir}/pkgconfig/${PN}sw.pc \
                     ${includedir}/dyplo/filequeue.hpp \
                     ${includedir}/dyplo/*scheduler.hpp \
                     ${includedir}/dyplo/*process.hpp \
                     "
FILES:${PN}sw = "${libdir}/${PN}sw.so*"
