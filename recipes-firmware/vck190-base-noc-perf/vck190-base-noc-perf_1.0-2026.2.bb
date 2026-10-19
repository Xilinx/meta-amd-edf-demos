SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1019_1_10190543/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_1019_1_10190543.tar.gz"
SRC_URI[sha256sum] = "fc37234eb9530f2b26e8a3bb7ac9f590dd5af62455e81f7b867ecfd9c5f9e7b1"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
