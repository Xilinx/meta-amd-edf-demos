SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0918_1_09180636/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0918_1_09180636.tar.gz"
SRC_URI[sha256sum] = "1b8479b83870c1e45d4a5a28bd4a4fc1997ae4b230912bc50427cf546794012c"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
