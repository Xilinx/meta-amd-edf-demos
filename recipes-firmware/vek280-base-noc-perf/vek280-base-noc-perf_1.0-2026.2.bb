SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0924_1_09240541/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0924_1_09240541.tar.gz"
SRC_URI[sha256sum] = "e44a0be0e691af0abaaf94ccac104e3a33074e6f403923e4df63f11781e303d3"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
