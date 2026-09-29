SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0929_1_09290125/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0929_1_09290125.tar.gz"
SRC_URI[sha256sum] = "87367f21e47dc070830695be4f7eef3e9f52ebf0e1b23e4e38900a20b94d24a8"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
