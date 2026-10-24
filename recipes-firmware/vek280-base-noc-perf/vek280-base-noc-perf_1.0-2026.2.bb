SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1024_1_10240546/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_1024_1_10240546.tar.gz"
SRC_URI[sha256sum] = "d04024cc47fadca9305f56b946307cb2d3daac628c89635ac2ada7acfc7157ef"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
