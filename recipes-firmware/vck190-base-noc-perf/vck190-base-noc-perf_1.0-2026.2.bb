SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1020_1_10200613/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_1020_1_10200613.tar.gz"
SRC_URI[sha256sum] = "7d789a0b107545871b11efc85530cde1577c5c87c05cdbb5939029d633ff5801"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
