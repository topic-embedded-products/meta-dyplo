DESCRIPTION = "Library for DYnamic Programmable LOgic configuration"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRCREV = "1692e38d55c7a6b539ed43a98cb50d74ad03b7f5"

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
