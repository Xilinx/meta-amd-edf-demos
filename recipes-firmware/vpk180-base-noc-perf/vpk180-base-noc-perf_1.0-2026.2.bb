SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0812_1_08120803/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0812_1_08120803.tar.gz"
SRC_URI[sha256sum] = "c102d15d414b6c3bba42ea44c69047b1d4aab9887b5ac530bb54f6fe8fd9bf50"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
