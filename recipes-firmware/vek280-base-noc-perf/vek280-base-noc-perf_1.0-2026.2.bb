SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0806_1_08060629/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0806_1_08060629.tar.gz"
SRC_URI[sha256sum] = "edecaa7bb1b4317343619854c348671c121e2fbe4280583c433211868820628e"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
