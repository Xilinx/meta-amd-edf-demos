SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1008_1_10080546/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_1008_1_10080546.tar.gz"
SRC_URI[sha256sum] = "1e319f6e378166fffcdb460efaaad583fa4d1c1c9783cb051fdee9f391f9e74b"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
