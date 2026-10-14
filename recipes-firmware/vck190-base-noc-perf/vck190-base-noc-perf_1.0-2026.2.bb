SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1014_1_10140754/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_1014_1_10140754.tar.gz"
SRC_URI[sha256sum] = "d683577ac2f5d0db2e40e6ac4b2ddb5e0fabcd0a6d8a3a3fe1ebdb95942edd1e"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
