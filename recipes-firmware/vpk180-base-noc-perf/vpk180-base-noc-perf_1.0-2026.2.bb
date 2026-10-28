SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1028_1_10280834/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_1028_1_10280834.tar.gz"
SRC_URI[sha256sum] = "951035046864d146f0b286c58434ea0842e98c1dd9b16f982e92d1ff446c8da1"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
