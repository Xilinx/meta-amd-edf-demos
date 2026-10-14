SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1014_1_10140754/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1014_1_10140754.tar.gz"
SRC_URI[sha256sum] = "565f446ff99d4d262de987fc3c3d771ffdb15ea6e7e42ffee6f52e88fa418be9"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
