SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1015_1_10150534/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_1015_1_10150534.tar.gz"
SRC_URI[sha256sum] = "3a74c33743525388ec15242018155cb7f9baf55197b9bbed107469411fa48553"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
