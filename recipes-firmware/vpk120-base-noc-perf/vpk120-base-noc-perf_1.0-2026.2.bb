SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0726_1_07261002/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0726_1_07261002.tar.gz"
SRC_URI[sha256sum] = "999059dbf2c892ae6ac6a270782a30784e2386b8aaeb5e66e5b46ecb9a1aed76"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
