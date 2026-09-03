SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0903_1_09030751/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0903_1_09030751.tar.gz"
SRC_URI[sha256sum] = "5ca9fbcbb357646fb6801497f369854d95709d08e3f9aabaecebddb0d206483a"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
