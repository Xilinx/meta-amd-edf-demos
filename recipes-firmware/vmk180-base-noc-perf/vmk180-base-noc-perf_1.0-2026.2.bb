SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1103_1_11030216/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_1103_1_11030216.tar.gz"
SRC_URI[sha256sum] = "9b98f705adf146aaceb3cb4573edba367499e92c606b74356ecc5f8274d2bf57"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
