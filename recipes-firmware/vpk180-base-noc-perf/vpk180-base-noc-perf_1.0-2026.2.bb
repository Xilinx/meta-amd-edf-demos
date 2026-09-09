SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0909_1_09090623/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0909_1_09090623.tar.gz"
SRC_URI[sha256sum] = "60247b88c93a08ffc9cd86e9519fe89ac3f61118f8fa71c9b7c734749cbcfb25"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
