SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0728_1_07280851/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0728_1_07280851.tar.gz"
SRC_URI[sha256sum] = "22649d84f6af571a2cf19db55d3756984d5c91dd210f0e895c2fb90161f32451"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
