SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0722_1_07220639/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0722_1_07220639.tar.gz"
SRC_URI[sha256sum] = "f97a446b3ae03d77d1f9deae41845800996000f394206cfbb47ead6da08b56ef"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
