SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0908_1_09080452/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0908_1_09080452.tar.gz"
SRC_URI[sha256sum] = "88c1943fc8a1a7d56472179fb05588362b99a3c090b3c61d76a73072f5cd4a1f"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
