SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0813_1_08130450/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0813_1_08130450.tar.gz"
SRC_URI[sha256sum] = "b3a945ff7be81c7153c23c660a66773ba565745eac7c5b3f3addd7b4901c0ee3"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
