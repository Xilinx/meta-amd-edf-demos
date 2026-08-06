SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0806_1_08060629/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0806_1_08060629.tar.gz"
SRC_URI[sha256sum] = "7bc650d11dd9298c30a6733eea0188868403e9cee2ed20e2ea3c9b1410f893e3"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
