SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1010_1_10100535/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_1010_1_10100535.tar.gz"
SRC_URI[sha256sum] = "59b75453307abb172cbac80b54acb68d5f60c4978850c2c8c9e66b7aacac78bb"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
