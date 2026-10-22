SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1022_1_10220242/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_1022_1_10220242.tar.gz"
SRC_URI[sha256sum] = "27ca34ab0bcea3ba5d74fadee4569823ddef5230b058af5d2ea01a7ac7d1b7f9"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
