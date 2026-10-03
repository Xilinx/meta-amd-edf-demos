SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1002_1_10030743/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_1002_1_10030743.tar.gz"
SRC_URI[sha256sum] = "39f978321672c0015369bf4cd65aae1152e4235836fb0bbecf13c539502375f8"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
