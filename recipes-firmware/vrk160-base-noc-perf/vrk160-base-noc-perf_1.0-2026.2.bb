SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0925_1_09250529/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0925_1_09250529.tar.gz"
SRC_URI[sha256sum] = "25003c44a7feb23b5b1edc2c4b0f4d84adb8ab99c7e08307c45253ca9982627d"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
