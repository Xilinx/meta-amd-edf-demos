SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1026_1_10260626/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_1026_1_10260626.tar.gz"
SRC_URI[sha256sum] = "ee2d18c92f08a9d8883c5ca84ffbd54a2ad7981d40b258612a01afeaf3425b16"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
