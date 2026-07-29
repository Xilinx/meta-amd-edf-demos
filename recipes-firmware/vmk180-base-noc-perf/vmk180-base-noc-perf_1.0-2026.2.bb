SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0729_1_07291202/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0729_1_07291202.tar.gz"
SRC_URI[sha256sum] = "da4ec9daf6dc33a4b31bac35a206f3be7fa792c40149dbaa74d01c98bd12c3c4"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
