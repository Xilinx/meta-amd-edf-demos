SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1028_1_10280834/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_1028_1_10280834.tar.gz"
SRC_URI[sha256sum] = "1a9aa242f2f3b96ff0d547c0553bac8a27a59d11f5d7f93a45e1958b122f385e"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
