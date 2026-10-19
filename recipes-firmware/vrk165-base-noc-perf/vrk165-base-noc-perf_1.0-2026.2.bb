SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1019_1_10190543/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_1019_1_10190543.tar.gz"
SRC_URI[sha256sum] = "a88bb3a994b638853aef64c69323ee919a85ea8a91a9aa8c5423d85a2ad9eb1a"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
