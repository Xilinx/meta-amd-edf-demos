SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0722_1_07220639/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0722_1_07220639.tar.gz"
SRC_URI[sha256sum] = "22f6eea78ecfd84dbd2d426f1eef8c9168b70bfce51d60c558664b6acc71f088"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
