SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0927_1_09270540/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0927_1_09270540.tar.gz"
SRC_URI[sha256sum] = "c32f913bd5370daa8aa35d78f7c39d2152a9b89fc1edfd6d27e9fdc656181294"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
