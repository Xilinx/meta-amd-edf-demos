SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0824_1_08240939/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0824_1_08240939.tar.gz"
SRC_URI[sha256sum] = "98fac73a25f255d36e853195f8ed4eb1cafce3c1df23896cc1f5ce60aeeff687"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
