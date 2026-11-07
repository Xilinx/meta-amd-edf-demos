SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1107_1_11071152/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_1107_1_11071152.tar.gz"
SRC_URI[sha256sum] = "10db52147cbf1a622b0d2452dac67d1ee62f9ead4f8b729e0ff78b901c0e4282"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
