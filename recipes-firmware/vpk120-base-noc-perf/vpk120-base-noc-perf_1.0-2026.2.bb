SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1020_1_10200613/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_1020_1_10200613.tar.gz"
SRC_URI[sha256sum] = "1a986c0120e73cc8ebe196519b7204e4ab84ce72e8c14a58c75331fd4d2971cf"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
