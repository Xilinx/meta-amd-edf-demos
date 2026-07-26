SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0726_1_07261002/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0726_1_07261002.tar.gz"
SRC_URI[sha256sum] = "aaa95461f191eef604d1ea8b00f53534717baf95dda58eaa6a12a788aab6a848"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
