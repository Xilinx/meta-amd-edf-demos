SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1008_1_10080546/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1008_1_10080546.tar.gz"
SRC_URI[sha256sum] = "cb94334a21603b5b97d5b2bc96f7fbd2b77476d34bfd09775ba8d8b15c123d4e"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
