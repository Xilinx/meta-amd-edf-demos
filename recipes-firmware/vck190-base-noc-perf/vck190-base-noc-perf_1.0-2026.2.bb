SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0910_1_09100633/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0910_1_09100633.tar.gz"
SRC_URI[sha256sum] = "2aa2c12dfde066b707c2ee288e3b6c0d844a4f1c8582fafa1a9ffb5281cb6780"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
