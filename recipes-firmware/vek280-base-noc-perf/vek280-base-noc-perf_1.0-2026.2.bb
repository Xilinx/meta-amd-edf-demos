SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0727_1_07270924/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0727_1_07270924.tar.gz"
SRC_URI[sha256sum] = "3de6a46b7f11e1aad9cf0446064813e50247f0a6ee56de58c1fa78eb4ca3ef32"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
