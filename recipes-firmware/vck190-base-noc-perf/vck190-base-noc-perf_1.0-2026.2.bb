SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0917_1_09170543/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0917_1_09170543.tar.gz"
SRC_URI[sha256sum] = "0419736cdc746c5e051d0e23520f647ebb296b0cff1ab687a6d4a0474c05ad4c"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
