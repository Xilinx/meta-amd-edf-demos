SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1019_1_10190543/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_1019_1_10190543.tar.gz"
SRC_URI[sha256sum] = "9830f792358bacfc8c39e58f80c5431ada62868c876aed8d2578da82f408a519"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
