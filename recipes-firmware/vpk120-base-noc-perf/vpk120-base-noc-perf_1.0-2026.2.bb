SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0722_1_07220639/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0722_1_07220639.tar.gz"
SRC_URI[sha256sum] = "260ae353296246310d44d7a4d05ed79388bb61df593ba993e35e19e82e78cf7c"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
