SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1010_1_10100535/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_1010_1_10100535.tar.gz"
SRC_URI[sha256sum] = "c612f8d0b9a83c0994c3514dbfcd0367b18eae203103efaa2cbd010d80ba342e"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
