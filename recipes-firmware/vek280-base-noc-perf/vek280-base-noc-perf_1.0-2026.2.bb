SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1001_1_10010725/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_1001_1_10010725.tar.gz"
SRC_URI[sha256sum] = "9e685fd6aa7e400283dee2a217973c6a3ce06b680b0460d9796f547c0dfb02f7"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
