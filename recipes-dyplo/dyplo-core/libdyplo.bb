DESCRIPTION = "Library for DYnamic Programmable LOgic configuration"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRCREV = "6a7694012709b24616a7f52068660d9c935a3400"

inherit autotools gitpkgv

PV = "2+${SRCPV}"
PKGV = "2+${GITPKGV}"
PR = "r1"
S = "${WORKDIR}/git"

GITHUB_TOPIC_URI ?= "git://github.com/topic-embedded-products"
SRC_URI = "${GITHUB_TOPIC_URI}/${PN}"

PACKAGES =+ "${PN}-test ${PN}-demo"
FILES_${PN}-test = "/usr/bin/test*"
FILES_${PN}-demo = "/usr/bin/dyplodemo*"
