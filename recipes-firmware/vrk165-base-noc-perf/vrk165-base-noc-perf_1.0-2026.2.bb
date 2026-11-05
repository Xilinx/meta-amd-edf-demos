SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1105_1_11042350/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_1105_1_11042350.tar.gz"
SRC_URI[sha256sum] = "35fb0f0d84c03c0e29778f739a002b408f023984e8d2413ee7e57946f6ab0b4b"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
