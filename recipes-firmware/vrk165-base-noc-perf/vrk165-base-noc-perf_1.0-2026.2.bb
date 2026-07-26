SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0726_1_07261002/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0726_1_07261002.tar.gz"
SRC_URI[sha256sum] = "83b3af9fea7821fd3ca98c695650815cbd736de6db77ad558ed76d5e3d15cb7d"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
