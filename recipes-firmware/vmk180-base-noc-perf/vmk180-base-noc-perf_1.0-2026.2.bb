SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0916_1_09160614/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0916_1_09160614.tar.gz"
SRC_URI[sha256sum] = "877edcc24996f72c7189d9a34ff997ca89e3232a02c35059a41f951719f94bd0"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
