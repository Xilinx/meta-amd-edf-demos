SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1010_1_10100535/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_1010_1_10100535.tar.gz"
SRC_URI[sha256sum] = "a14b479a70cca9659ae59a97a3fa2e6a9736142ca0a1b5062808a5bb44944689"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
