SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1023_1_10230747/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_1023_1_10230747.tar.gz"
SRC_URI[sha256sum] = "710d851d0ce187da70641dd57bcb628fb78e279611500a55878c21fbb6b2b058"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
