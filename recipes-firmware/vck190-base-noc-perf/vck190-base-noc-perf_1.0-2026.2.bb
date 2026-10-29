SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1029_1_10290558/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_1029_1_10290558.tar.gz"
SRC_URI[sha256sum] = "7804629d439b3917a00cb2bfc90b32bf7460ac57ccd84f4183a66a268ee95876"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
