SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0809_1_08090727/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0809_1_08090727.tar.gz"
SRC_URI[sha256sum] = "0751e403bd3d8fcebee58ba2cc3f16ac3df1dcf6e5fb15f943b1a16148b5098e"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
