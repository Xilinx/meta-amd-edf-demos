SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1107_1_11071152/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_1107_1_11071152.tar.gz"
SRC_URI[sha256sum] = "b8370b1370a4cf5dcabf25c018c5f49a6d4543c0537362f8e9f311852d6d3eaf"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
