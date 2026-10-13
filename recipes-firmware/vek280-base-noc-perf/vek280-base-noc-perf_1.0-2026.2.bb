SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1013_1_10130555/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_1013_1_10130555.tar.gz"
SRC_URI[sha256sum] = "e98076a4412312a3df520af7fa65a41dbb261ab21bbac572d3a4d7d067e63ee4"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
