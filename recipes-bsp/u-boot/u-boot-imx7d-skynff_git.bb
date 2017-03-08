require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "u-boot for Skyline boards."
COMPATIBLE_MACHINE = "(imx7d-skynff)"

PROVIDES = "u-boot"

PV = "v2016.11+git${SRCPV}"

SRCREV = "a0ba5a106c9c80e32d1b49dab88b8e575e03a790"
SRCBRANCH = "2016.11+fslc"
SRC_URI = "git://github.com/jbrennan3rd/u-boot-fslc.git;branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
