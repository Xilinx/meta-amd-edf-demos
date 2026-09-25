SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0925_1_09250529/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0925_1_09250529.tar.gz"
SRC_URI[sha256sum] = "19421180f313a6bc4c0cfb3960e0edd1b959b6452ec8d90c529ae5fd99de30d3"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
