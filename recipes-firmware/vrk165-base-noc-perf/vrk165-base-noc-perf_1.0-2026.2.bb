SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit devicetree

# This recipe is a standalone overlay, not the system device tree, so don't let
# it provide virtual/dtb (which would clash with the machine's preferred dtb).
PROVIDES:remove = "virtual/dtb"

SRC_URI = "https://artifactory.xilinx.com/artifactory/petalinux-hwproj-dev/sdt/2026.2/2026.2_0702_1_07022126/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0702_1_07022126.tar.gz;striplevel=1"
SRC_URI[sha256sum] = "33acff0afe7bcb6af46717ac098c6c0ac4e31d7807b6aca9d3183e090fb4e0bb"

S = "${UNPACKDIR}"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"
COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"

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
