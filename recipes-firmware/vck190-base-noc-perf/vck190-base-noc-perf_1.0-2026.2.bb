SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1025_1_10250540/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_1025_1_10250540.tar.gz"
SRC_URI[sha256sum] = "bc8481bd31d5ac671e2aa7cca3ef802d5942ea9d741b04f017ceebaef42bcaad"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
