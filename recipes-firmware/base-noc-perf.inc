LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit devicetree

# This recipe is a standalone overlay, not the system device tree, so don't let
# it provide virtual/dtb (which would clash with the machine's preferred dtb).
PROVIDES:remove = "virtual/dtb"

NOC_OVERLAY_DIR ?= ""
S = "${UNPACKDIR}/${NOC_OVERLAY_DIR}"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"

# This overlay only references absolute NoC register addresses, so it does not
# need the kernel device-tree includes/headers.
KERNEL_INCLUDE = ""

# Install the compiled overlay as loadable firmware (in addition to the default
# devicetree class deploy under /boot/devicetree).
do_install:append() {
    for dtbo in ${B}/*.dtbo; do
        [ -e "${dtbo}" ] || continue
        install -Dm 0644 "${dtbo}" \
            ${D}${nonarch_base_libdir}/firmware/xilinx/${PN}/${PN}.dtbo
    done
}

FILES:${PN} += "${nonarch_base_libdir}/firmware/xilinx/${PN}"
