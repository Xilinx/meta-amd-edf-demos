SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1009_1_10090707/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_1009_1_10090707.tar.gz"
SRC_URI[sha256sum] = "b6dcc39f1465f72d60e87e7e375466bbfb367137359399a856cecae43051e4de"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
