SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1103_1_11030216/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_1103_1_11030216.tar.gz"
SRC_URI[sha256sum] = "a4aba22202d6c13c2de52f7970053794aa61aafcbe731e2d9a3157f0c647d6bf"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
