SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0903_1_09030751/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0903_1_09030751.tar.gz"
SRC_URI[sha256sum] = "5ffe07f90c63e7678d82f8b3bd27f2d4a85abf5f15aa5e5f1061bb1fbec958e1"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
