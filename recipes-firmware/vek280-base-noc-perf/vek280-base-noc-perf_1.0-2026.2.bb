SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1029_1_10290558/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_1029_1_10290558.tar.gz"
SRC_URI[sha256sum] = "511591acbebcbb7d73c2c2d66f7f378f1a8d7a81a5c1d2d24917ab496e43a51c"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
