SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1005_1_10050713/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_1005_1_10050713.tar.gz"
SRC_URI[sha256sum] = "3debf0ac56ad98873a68566264df11bc3d6364b0d9687f24fc7e60af3299103a"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
