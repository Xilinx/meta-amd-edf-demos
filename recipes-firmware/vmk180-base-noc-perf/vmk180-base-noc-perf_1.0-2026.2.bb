SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0912_1_09120607/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0912_1_09120607.tar.gz"
SRC_URI[sha256sum] = "59926aa2c9d9034f2a60f2124a0f2aae2003d6e9e7430fba35eda5f3daecc1af"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
