SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1029_1_10290558/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_1029_1_10290558.tar.gz"
SRC_URI[sha256sum] = "3cbcfd5acf0e1b1b1b8fed8805f4988b2822282dc0ae4c9efdcdc618884c4cdd"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
