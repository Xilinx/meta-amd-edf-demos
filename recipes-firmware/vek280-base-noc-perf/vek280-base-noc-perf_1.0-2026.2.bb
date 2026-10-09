SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1009_1_10090707/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_1009_1_10090707.tar.gz"
SRC_URI[sha256sum] = "04d0f679296d4f5aa0f6cb4c2d20cc6fe08ad9914106af0b99c8e9390f0707c3"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
