SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0909_1_09090623/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0909_1_09090623.tar.gz"
SRC_URI[sha256sum] = "0d761a2fccb6ac3b8087d81de19ec14615776307d2e820c3af9cf70146bd48c0"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
