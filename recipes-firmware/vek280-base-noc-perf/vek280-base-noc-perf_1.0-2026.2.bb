SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0723_1_07231200/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0723_1_07231200.tar.gz"
SRC_URI[sha256sum] = "b5423301d54fe35a560b9942accc9c912815f4a0ccb2c19c68d6f2708f4e12b0"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
