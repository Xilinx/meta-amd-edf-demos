SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0918_1_09180636/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0918_1_09180636.tar.gz"
SRC_URI[sha256sum] = "7d27fdbe97b98649a3f42340ee63a7b03b5de0f766f236ba18f23af7b38318d8"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
