SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1102_1_11020153/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_1102_1_11020153.tar.gz"
SRC_URI[sha256sum] = "8633a790cba68f82418257c314c920940a6f9bd99c0f1d08bdbbe42be9dc9de6"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
