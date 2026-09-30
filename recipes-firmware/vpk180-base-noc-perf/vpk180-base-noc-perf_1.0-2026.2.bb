SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0930_1_09300557/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0930_1_09300557.tar.gz"
SRC_URI[sha256sum] = "f76d0f88a01c9397267b2031ebddcca5244d9a39c3c552f13dec030988e1a1b6"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
