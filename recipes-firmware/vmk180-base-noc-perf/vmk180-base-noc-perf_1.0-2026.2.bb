SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0724_1_07241050/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0724_1_07241050.tar.gz"
SRC_URI[sha256sum] = "7ebf34179ce4a6466826be2954ffd6357992568d2832a77b7c80f96529d9b3a6"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
