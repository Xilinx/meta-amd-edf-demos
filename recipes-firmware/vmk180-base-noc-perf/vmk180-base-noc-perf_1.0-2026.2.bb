SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1014_1_10140754/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_1014_1_10140754.tar.gz"
SRC_URI[sha256sum] = "4e940bea3730bea869cf7290ab60745f8e962a739ced8d9159a4b22b7e43c22e"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
