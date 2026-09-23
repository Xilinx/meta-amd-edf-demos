SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0923_1_09230529/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0923_1_09230529.tar.gz"
SRC_URI[sha256sum] = "c0de449abf70c6db00d05f07db8bbeb40f728e1c70b78a6d3b77534f318f6c37"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
