SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0930_1_09300557/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0930_1_09300557.tar.gz"
SRC_URI[sha256sum] = "3e9f75ec99fb380a9a686c4e7c34b692e412825c24b3a6f353f372853f9172da"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
