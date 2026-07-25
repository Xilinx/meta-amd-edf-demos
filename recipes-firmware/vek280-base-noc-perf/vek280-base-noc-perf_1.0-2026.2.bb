SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0725_1_07251404/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0725_1_07251404.tar.gz"
SRC_URI[sha256sum] = "3e9f2e7dab07123c1dcea54b3abf13f8140c260214e11079ba6c17af4ad9aee3"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
