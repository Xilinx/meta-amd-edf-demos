SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0809_1_08090727/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0809_1_08090727.tar.gz"
SRC_URI[sha256sum] = "c25b424c1d65a2c96c44837f30fa85471df674ddaaadc63dcbcc74ae6b953690"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
