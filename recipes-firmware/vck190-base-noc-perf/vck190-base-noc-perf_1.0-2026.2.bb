SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0929_1_09290125/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0929_1_09290125.tar.gz"
SRC_URI[sha256sum] = "da65dcabb5534756eb826c201c284c0fd8471da732e5d9e3cc40e734dab185e7"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
