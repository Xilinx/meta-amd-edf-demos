SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1014_1_10140754/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_1014_1_10140754.tar.gz"
SRC_URI[sha256sum] = "c87dc841b6b5c766788f09c05a9dd57635d197cd3c92668bc52e3c50f551a28c"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
