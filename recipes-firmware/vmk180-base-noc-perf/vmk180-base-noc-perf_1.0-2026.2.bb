SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1001_1_10010725/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_1001_1_10010725.tar.gz"
SRC_URI[sha256sum] = "031f8c4bb047291ec741964bb8951bc079a7367e11e33de7eebbef642998df16"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
