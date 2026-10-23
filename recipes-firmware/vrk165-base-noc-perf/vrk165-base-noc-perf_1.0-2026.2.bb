SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1023_1_10230747/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_1023_1_10230747.tar.gz"
SRC_URI[sha256sum] = "9f157e3e440c044b646995a3a94ba41950e002d1f4cc1b8d0099740710c913e8"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
