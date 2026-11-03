SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1103_1_11030216/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_1103_1_11030216.tar.gz"
SRC_URI[sha256sum] = "0d0f1d9d52b96381fef3690310aa6068e46640c799e9af3bc6c34a17bf7f166d"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
