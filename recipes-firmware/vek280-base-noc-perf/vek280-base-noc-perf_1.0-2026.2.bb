SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1031_1_10310614/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_1031_1_10310614.tar.gz"
SRC_URI[sha256sum] = "7fc802793d1228a4c2187165df0e4a5c950b1c5237366c777aa13d590d6e07a1"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
