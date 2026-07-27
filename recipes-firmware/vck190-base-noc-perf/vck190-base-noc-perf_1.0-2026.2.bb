SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0727_1_07270924/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0727_1_07270924.tar.gz"
SRC_URI[sha256sum] = "083a511cebe21219d3e2954052a8c107e337db72dd318f90c71f086ce013e046"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
