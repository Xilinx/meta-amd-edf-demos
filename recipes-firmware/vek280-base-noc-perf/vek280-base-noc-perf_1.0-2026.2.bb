SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0813_1_08130450/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0813_1_08130450.tar.gz"
SRC_URI[sha256sum] = "279a83e69c83047c5242d38b23ca8321db43fc368571460df938c744bf733cb0"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
