require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "u-boot for Skyline boards."
COMPATIBLE_MACHINE = "(imx7d-skynff)"

PROVIDES = "u-boot"

PV = "v2016.11+git${SRCPV}"

SRCREV = "imx7d-skynff"
SRCBRANCH = "imx7d-skynff"
SRC_URI = "git://github.com/jbrennan3rd/u-boot-fslc.git;branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
