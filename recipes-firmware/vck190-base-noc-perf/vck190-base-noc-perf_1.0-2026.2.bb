SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0731_1_07310756/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0731_1_07310756.tar.gz"
SRC_URI[sha256sum] = "98118065208139eb5409ac00f01853a52371eb980313078d5eeff549b6a8a0ef"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
