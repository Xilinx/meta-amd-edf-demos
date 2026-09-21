SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0921_1_09210704/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0921_1_09210704.tar.gz"
SRC_URI[sha256sum] = "dc69e4d3b94ca9a3765f560ae994cdc722a6a8b46ceec554765735b92be0dbdb"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
