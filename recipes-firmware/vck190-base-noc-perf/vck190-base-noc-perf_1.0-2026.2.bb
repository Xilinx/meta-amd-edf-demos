SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0812_1_08120803/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0812_1_08120803.tar.gz"
SRC_URI[sha256sum] = "0381fbdae8eb604bd06a6b1ca134a5357d67f29bce082444ff77e36308137880"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
