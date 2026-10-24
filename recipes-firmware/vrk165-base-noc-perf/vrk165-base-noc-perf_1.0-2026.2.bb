SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1024_1_10240546/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_1024_1_10240546.tar.gz"
SRC_URI[sha256sum] = "3a223dfb9e87ad92123530f1b0d4c5df92922c7a83b291bb23793bda2b5d4535"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
