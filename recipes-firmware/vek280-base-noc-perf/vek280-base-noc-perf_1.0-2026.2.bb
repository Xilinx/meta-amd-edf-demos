SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1002_1_10030743/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_1002_1_10030743.tar.gz"
SRC_URI[sha256sum] = "d2b02520a79e050a9aee264c1815ffa5d2e304f3f3340c003e4c4b74b75d9f53"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
