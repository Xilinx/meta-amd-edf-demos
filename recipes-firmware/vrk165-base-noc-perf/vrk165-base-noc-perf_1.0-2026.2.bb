SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1107_1_11071152/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_1107_1_11071152.tar.gz"
SRC_URI[sha256sum] = "192876fb518357ba7c79f3043632b84a8ce4a9ea0bd04d008424f585aba6bf39"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
