SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit devicetree

# This recipe is a standalone overlay, not the system device tree, so don't let
# it provide virtual/dtb (which would clash with the machine's preferred dtb).
PROVIDES:remove = "virtual/dtb"

SRC_URI = "https://xcoartifactory.xilinx.com/artifactory/petalinux-hwproj-dev-local/edf_files/2026.2/06231351/external/fwapp/vck190-base-noc-perf.tar.gz"

SRC_URI[sha256sum] = "b091a2582b50b235688164eeb5ef484709002173a5986004765f7ed044c7d439"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"
COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"

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
