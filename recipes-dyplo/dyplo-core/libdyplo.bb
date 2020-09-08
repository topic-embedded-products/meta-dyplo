DESCRIPTION = "Library for DYnamic Programmable LOgic configuration"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRCREV = "9b5e1cd588d77ef7f8319fea449e2b4e5c75130a"

inherit autotools gitpkgv

PV = "2+${SRCPV}"
PKGV = "2+${GITPKGV}"
S = "${WORKDIR}/git"

GITHUB_TOPIC_URI ?= "git://github.com/topic-embedded-products"
SRC_URI = "${GITHUB_TOPIC_URI}/${BPN}"

PACKAGES =+ "${PN}-test ${PN}-demo ${PN}sw-dev ${PN}sw"
FILES_${PN}-test = "${bindir}/test*"
FILES_${PN}-demo = "${bindir}/dyplodemo*"

# Split the software library into its own package
FILES_${PN}sw-dev = "${libdir}/${PN}sw.so \
                     ${libdir}/pkgconfig/${PN}sw.pc \
                     ${includedir}/dyplo/filequeue.hpp \
                     ${includedir}/dyplo/*scheduler.hpp \
                     ${includedir}/dyplo/*process.hpp \
                     "
FILES_${PN}sw = "${libdir}/${PN}sw.so*"
