SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1007_1_10070233/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_1007_1_10070233.tar.gz"
SRC_URI[sha256sum] = "3c60d7a5592693c2d43c134c0241a74d21a7fba00cf7c11135f01018257869c6"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
