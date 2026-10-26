SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1026_1_10260626/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_1026_1_10260626.tar.gz"
SRC_URI[sha256sum] = "c5dd2266f92f441d2c0ba6facdd10a99521b2817aa818c909a75b0a635ce0b5c"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
