SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0929_1_09291029/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0929_1_09291029.tar.gz"
SRC_URI[sha256sum] = "04cff806c3c4773734fe18710882b9b5124a4fc6134b89cdfbb732ad2bcf4a1f"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
