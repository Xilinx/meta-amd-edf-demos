SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0920_1_09200102/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0920_1_09200102.tar.gz"
SRC_URI[sha256sum] = "461462e08b725e358db4ea9e2c72a54e5dae7feca8e0ba94932b17a391340463"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
