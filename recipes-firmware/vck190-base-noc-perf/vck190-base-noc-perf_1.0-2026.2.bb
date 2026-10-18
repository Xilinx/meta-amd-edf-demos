SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1018_1_10180550/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_1018_1_10180550.tar.gz"
SRC_URI[sha256sum] = "66f2617f3c9eff2cd43eb14f3dd383922f837959b531fd4faab3011aefda2f06"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
