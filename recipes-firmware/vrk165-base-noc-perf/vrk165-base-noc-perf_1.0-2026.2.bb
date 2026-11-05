SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1104_1_11040130/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_1104_1_11040130.tar.gz"
SRC_URI[sha256sum] = "76ab5eb8037ef7a3e080068864e246a8fdfa86277f102ee48004a64ebc5acf11"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
