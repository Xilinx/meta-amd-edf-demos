SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1029_1_10290558/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1029_1_10290558.tar.gz"
SRC_URI[sha256sum] = "1d048d2f062beda42d1e5e75725a74aac4e05c94059dc83bd790fcb614b04417"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
