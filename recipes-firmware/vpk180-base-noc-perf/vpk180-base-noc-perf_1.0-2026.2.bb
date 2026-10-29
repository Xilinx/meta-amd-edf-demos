SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1029_1_10290558/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_1029_1_10290558.tar.gz"
SRC_URI[sha256sum] = "c01cc850fd95ea8aff494c15f3c94e3c743ccc8f48209b015950b7acbd82ca45"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
