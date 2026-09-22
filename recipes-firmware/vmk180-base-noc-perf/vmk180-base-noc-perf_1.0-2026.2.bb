SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0922_1_09220532/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0922_1_09220532.tar.gz"
SRC_URI[sha256sum] = "0d0583fdaae9f84990582e6e1a53668ec6904191b0d09665453664fac78df95d"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
