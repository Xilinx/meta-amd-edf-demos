SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1102_1_11020153/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_1102_1_11020153.tar.gz"
SRC_URI[sha256sum] = "e4fd62799b1fc664f0ef8fc6b761f6ef6bfac53c506764ba348b5fb29b575f47"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
