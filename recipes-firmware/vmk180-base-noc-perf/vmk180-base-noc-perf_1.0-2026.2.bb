SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0824_1_08240939/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0824_1_08240939.tar.gz"
SRC_URI[sha256sum] = "934a602824552e536668ff95b145ce800a2d334984765257abb097b7f467d2e7"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
