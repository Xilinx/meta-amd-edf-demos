SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0801_1_08010632/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0801_1_08010632.tar.gz"
SRC_URI[sha256sum] = "7b6bb0cb42b81ad28dc824af66a7fada64ccbad3712dd5947a0e725d5c3a8952"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
