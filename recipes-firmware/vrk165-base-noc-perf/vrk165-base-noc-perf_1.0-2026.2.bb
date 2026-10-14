SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1014_1_10140754/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_1014_1_10140754.tar.gz"
SRC_URI[sha256sum] = "83121ce6055938e5e39c301cd2f791ac5d4f20fc76d3ff81ca20c84b46ab99e9"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
