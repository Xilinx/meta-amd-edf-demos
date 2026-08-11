SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0811_1_08110739/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0811_1_08110739.tar.gz"
SRC_URI[sha256sum] = "545652543f7a0685871d5404bdcd0ad152da59b76b76f454c76faa12cf560b79"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
