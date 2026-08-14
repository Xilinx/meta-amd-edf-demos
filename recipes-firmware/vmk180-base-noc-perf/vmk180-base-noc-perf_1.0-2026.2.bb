SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0814_1_08140754/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0814_1_08140754.tar.gz"
SRC_URI[sha256sum] = "d6511e8d6c077d0b5b21b2cb15c822712824de2966b6a5a6f426231b7fdbcb1c"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
