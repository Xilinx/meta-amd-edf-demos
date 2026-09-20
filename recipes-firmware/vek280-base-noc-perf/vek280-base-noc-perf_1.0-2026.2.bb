SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0920_1_09200102/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0920_1_09200102.tar.gz"
SRC_URI[sha256sum] = "d3e012e793b52dd36132f1e1de4dd1a1c47b4b043a8d6871b5447e3ffe4952a5"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
