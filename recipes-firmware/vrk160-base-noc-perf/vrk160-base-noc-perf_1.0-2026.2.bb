SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0915_1_09150548/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0915_1_09150548.tar.gz"
SRC_URI[sha256sum] = "724aea693aed8c2783efbf938569977f2b452439626b6b729ec641ca51b07c5b"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
