SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0923_1_09230529/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0923_1_09230529.tar.gz"
SRC_URI[sha256sum] = "63d8969e7027b6f09dccea13040d95f965a72c846ba6d97f5845c589c2e3461a"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
