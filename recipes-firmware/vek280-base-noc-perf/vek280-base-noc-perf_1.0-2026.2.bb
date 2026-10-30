SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1030_1_10300625/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_1030_1_10300625.tar.gz"
SRC_URI[sha256sum] = "3e59157223f35d06d8dfbcf321c73e60685f8a06d14d9b25f15256383303e80a"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
