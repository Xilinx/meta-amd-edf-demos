SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1022_1_10220242/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1022_1_10220242.tar.gz"
SRC_URI[sha256sum] = "f7e9a8e9da6c4d9f1b07c7cc4405dbb76a117bde4e01dae109a2a689e6c284a9"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
