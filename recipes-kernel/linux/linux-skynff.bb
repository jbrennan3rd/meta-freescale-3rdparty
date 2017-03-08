# Copyright (C) 2016 NXP Semiconductors
# Released under the MIT license (see COPYING.MIT for the terms)

include recipes-kernel/linux/linux-fslc.inc

DESCRIPTION = "Linux kernel based on linux-fsl-imx branch 4.1-2.0.x-imx from FSL Community BSP \
with additional patches to cover devices specific on SkyNFF board."

SRCBRANCH = "imx7d-skynff"
SRCREV = "imx7d-skynff"
LOCALVERSION = "-${SRCBRANCH}-skynff"

SRC_URI = "git://github.com/jbrennan3rd/linux-fslc.git;branch=${SRCBRANCH} \
           file://defconfig"

COMPATIBLE_MACHINE = "(imx7d-skynff)"
