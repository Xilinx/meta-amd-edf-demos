SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0805_1_08050715/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0805_1_08050715.tar.gz"
SRC_URI[sha256sum] = "35789522fee9d36fd1355057c5f29a52b73aa7ee97d42cb4a60c69a8696a41fe"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
