SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0929_1_09290125/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0929_1_09290125.tar.gz"
SRC_URI[sha256sum] = "645b9d6fc54433087e1927a5816b66a59c7aee20dbeb5cfac2434b0155dccbd1"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
