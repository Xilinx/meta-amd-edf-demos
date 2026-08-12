SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0812_1_08120803/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0812_1_08120803.tar.gz"
SRC_URI[sha256sum] = "d5477bac40b2c56791918f9e0574b3d7a78b3c96a5c1a62a3ab8a2df40976e7b"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
