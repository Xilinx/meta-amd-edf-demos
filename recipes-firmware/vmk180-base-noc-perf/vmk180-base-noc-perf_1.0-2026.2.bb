SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1107_1_11071152/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_1107_1_11071152.tar.gz"
SRC_URI[sha256sum] = "00ded3ba0978c691b79f095d4a2308afcd7850127b4cee6a81452aea8469d777"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
