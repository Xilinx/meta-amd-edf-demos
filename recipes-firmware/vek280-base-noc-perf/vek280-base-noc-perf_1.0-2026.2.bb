SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0728_1_07280851/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0728_1_07280851.tar.gz"
SRC_URI[sha256sum] = "45d2c994c4708f6930be8c80cef41ffc3f6b49d88a4bd6d57c96c102fb62ad29"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
