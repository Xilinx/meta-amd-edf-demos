SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0721_1_07210642/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0721_1_07210642.tar.gz"
SRC_URI[sha256sum] = "4a09fe127d764a21013211dc71ed1db0c07777a0963e8c9c6fd4e6f29f6e1bc0"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
