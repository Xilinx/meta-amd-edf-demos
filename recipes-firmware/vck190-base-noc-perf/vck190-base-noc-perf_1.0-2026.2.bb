SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0814_1_08140754/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0814_1_08140754.tar.gz"
SRC_URI[sha256sum] = "5c1adf017d63e4ddc54a35056092434e0086e8bc57b26e2d967e94ebb0d4ff16"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
