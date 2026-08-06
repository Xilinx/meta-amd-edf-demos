SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0806_1_08060629/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0806_1_08060629.tar.gz"
SRC_URI[sha256sum] = "f23b5b8534e5c9ed7ab43849777c4bea37e4b75374f04c33c6e4d0a7061d3791"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
