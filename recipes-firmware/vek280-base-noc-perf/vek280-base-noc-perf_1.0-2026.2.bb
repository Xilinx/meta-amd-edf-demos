SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1010_1_10100535/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_1010_1_10100535.tar.gz"
SRC_URI[sha256sum] = "397d39f4d857c254f93e7e34b357081d91b42aa2acf0de09a5ac2363f994ee09"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
