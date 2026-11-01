SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1101_1_11010621/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_1101_1_11010621.tar.gz"
SRC_URI[sha256sum] = "beb40aba5e0457658dc05720a84cfc81466691b1207f7feffe37e36809663983"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
