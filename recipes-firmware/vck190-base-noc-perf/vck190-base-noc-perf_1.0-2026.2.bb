SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0726_1_07261002/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0726_1_07261002.tar.gz"
SRC_URI[sha256sum] = "62b4102a63a34455075a8e5f2c80a853ef4138feaf182e7e1e2e45ec340bc3af"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
