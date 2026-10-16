SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1016_1_10160545/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_1016_1_10160545.tar.gz"
SRC_URI[sha256sum] = "11f807c0874898f559f99f052b394baa979eec8e4ae1e9508d1707409159bfe2"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
