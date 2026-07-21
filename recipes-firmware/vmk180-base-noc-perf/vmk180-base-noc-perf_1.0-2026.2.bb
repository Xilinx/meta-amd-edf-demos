SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0721_1_07210642/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0721_1_07210642.tar.gz"
SRC_URI[sha256sum] = "ec7ce683ff23f4513e1198033d2febf421cfe280de2bb7ba065d4875d1db5b2d"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
