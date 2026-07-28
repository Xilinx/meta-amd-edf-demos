SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0728_1_07280851/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0728_1_07280851.tar.gz"
SRC_URI[sha256sum] = "db25b279f4ed9ea1013700a3317355a411bc33447d6f17f27b3657f17dabc842"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
