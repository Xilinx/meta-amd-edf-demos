SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0924_1_09240541/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0924_1_09240541.tar.gz"
SRC_URI[sha256sum] = "58b71dd155981ecc8f2e5d2ae412f759df7bfc95c011f05ec6e3dcbd3fbec45c"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
