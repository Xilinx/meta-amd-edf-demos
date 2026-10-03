SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1002_1_10030743/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_1002_1_10030743.tar.gz"
SRC_URI[sha256sum] = "3273f5042c061304a20f4865c7416173137e923cf91996aaa157cd8b84ead2ee"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
