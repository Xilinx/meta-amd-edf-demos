SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0812_1_08120803/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0812_1_08120803.tar.gz"
SRC_URI[sha256sum] = "ad9a15356142f3953c1bed33de3ca707e61dc2110145985a6c380f4abc1f5bd5"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
