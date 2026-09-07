SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0907_1_09070710/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0907_1_09070710.tar.gz"
SRC_URI[sha256sum] = "f3b7c5c3e1aaebb06c8fad06b82504c52de0b06e8247f0fd9091318b047392d1"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
