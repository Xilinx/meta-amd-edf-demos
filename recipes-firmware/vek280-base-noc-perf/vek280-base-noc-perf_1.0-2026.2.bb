SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1101_1_11010621/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_1101_1_11010621.tar.gz"
SRC_URI[sha256sum] = "4986ffcc37cd2fae24f0a5f7d1a4a3a5c340ef99fe95cf201fcad093727bbee9"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
