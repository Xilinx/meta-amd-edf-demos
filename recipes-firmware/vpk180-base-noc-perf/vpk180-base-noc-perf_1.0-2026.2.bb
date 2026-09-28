SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0928_1_09280533/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0928_1_09280533.tar.gz"
SRC_URI[sha256sum] = "f2f43b4ce52dd45b30ce01872de184a6190e0d77b7f70728cecd85e753f22d22"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
