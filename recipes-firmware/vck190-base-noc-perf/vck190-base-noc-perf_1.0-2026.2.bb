SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0810_1_08101825/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0810_1_08101825.tar.gz"
SRC_URI[sha256sum] = "256154ee8851d34ff55a78584c83a95a2cb77784b6e51620732d7884a01a3382"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
