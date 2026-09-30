SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0930_1_09300557/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0930_1_09300557.tar.gz"
SRC_URI[sha256sum] = "f6e78c6292b2a1a5a043e4eeec2d39796b705d3f21d305d1e6cd0db9d116fbb7"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
