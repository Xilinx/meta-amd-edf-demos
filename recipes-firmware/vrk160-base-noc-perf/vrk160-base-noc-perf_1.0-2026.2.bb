SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0813_1_08130450/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0813_1_08130450.tar.gz"
SRC_URI[sha256sum] = "b98847c762a4a502e12653b33f223cd4dbb20ea58abde7ff1fcc4c72efe14109"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
