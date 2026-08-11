SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0811_1_08110739/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0811_1_08110739.tar.gz"
SRC_URI[sha256sum] = "4808dedecf8825151988abdebbd65c00c7ffd5a2d8d12afc699dd115472fcff4"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
