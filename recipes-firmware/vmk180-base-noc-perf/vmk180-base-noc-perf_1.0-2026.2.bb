SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0803_1_08030529/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0803_1_08030529.tar.gz"
SRC_URI[sha256sum] = "7ee6265ceac11c51cc6eb1a8dbc22365a5dcd99e63a46d49345db8b8fe1f57f6"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
