SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0817_1_08170744/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0817_1_08170744.tar.gz"
SRC_URI[sha256sum] = "5e6988f63774f74243cef0334a77e5c8d08402b5fe20cc1f68c1f00044273747"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
