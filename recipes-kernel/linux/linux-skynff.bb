# Copyright (C) 2016 NXP Semiconductors
# Released under the MIT license (see COPYING.MIT for the terms)

include recipes-kernel/linux/linux-fslc.inc

DESCRIPTION = "Linux kernel based on linux-fsl-imx branch 4.1-2.0.x-imx from FSL Community BSP \
with additional patches to cover devices specific on SkyNFF board."

SRCBRANCH = "4.1-2.0.x-imx"
SRCREV = "c1f3745525e78815dc6b4b19298c46c217897fe0"
LOCALVERSION = "-${SRCBRANCH}-skynff"

SRC_URI = "git://github.com/jbrennan3rd/linux-fslc.git;branch=${SRCBRANCH} \
           file://defconfig"

COMPATIBLE_MACHINE = "(imx7d-skynff)"
