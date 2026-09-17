SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0917_1_09170543/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0917_1_09170543.tar.gz"
SRC_URI[sha256sum] = "3469a4dd8d3e471eb22aa79e013fdb119a40077221fe7adadd0197033ef6715d"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
