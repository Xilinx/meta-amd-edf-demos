SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0919_1_09190402/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0919_1_09190402.tar.gz"
SRC_URI[sha256sum] = "74e1702d976ae14c0b7c34d69c7543a1d59581613a37b0a5be016d4c5bb6189a"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
