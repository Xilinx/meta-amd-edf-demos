SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0906_1_09060734/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0906_1_09060734.tar.gz"
SRC_URI[sha256sum] = "c509ca09e83c87b34970f5accc68d796801da27aff934b53880cb8c14c2e9521"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
