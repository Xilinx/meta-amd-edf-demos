SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0723_1_07231200/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0723_1_07231200.tar.gz"
SRC_URI[sha256sum] = "6f871c27a196ad7b7abd5378cdbb90423ad230f567c82c7a36bfbc3447c6b072"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
