SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0927_1_09270540/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0927_1_09270540.tar.gz"
SRC_URI[sha256sum] = "c2a28f354b11bf953599b487be2e261e757585909e4691a69524ca9a03c7357a"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
