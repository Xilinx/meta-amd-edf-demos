SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0722_1_07220639/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0722_1_07220639.tar.gz"
SRC_URI[sha256sum] = "ea8521f23cf6dad377a078a6ba3d6603a28e591425ee1e4365a0f440f0caec8f"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
