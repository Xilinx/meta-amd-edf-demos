SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0801_1_08010632/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0801_1_08010632.tar.gz"
SRC_URI[sha256sum] = "e2f2611f893ebb925e67307374ec236ff0322faf50ee28ca36cbc84efa577ac3"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
