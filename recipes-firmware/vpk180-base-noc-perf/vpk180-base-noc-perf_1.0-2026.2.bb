SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0923_1_09230529/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0923_1_09230529.tar.gz"
SRC_URI[sha256sum] = "fab3004b9dd052222be21bd8f75f44e743977e919dfa77067ac85228f12b255d"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
