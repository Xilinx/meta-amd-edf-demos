SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1009_1_10090707/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1009_1_10090707.tar.gz"
SRC_URI[sha256sum] = "2db0924eae9fb2957a8a13685ff2916324eef62a0741ef21fb32779adb49ef97"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
