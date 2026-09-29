SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0929_1_09291029/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0929_1_09291029.tar.gz"
SRC_URI[sha256sum] = "68d1e64d878f5fc991c487806ba5b19cc3946f748dc1799c9cf5a41156b8dcb5"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
