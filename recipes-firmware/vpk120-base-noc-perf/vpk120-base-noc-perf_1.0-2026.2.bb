SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1019_1_10190543/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_1019_1_10190543.tar.gz"
SRC_URI[sha256sum] = "f4c38288b4ae7362d9d95a5d1f83e1688332c32b2c32e3f4a7a84f7760b1702c"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
