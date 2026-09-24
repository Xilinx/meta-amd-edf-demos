SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0924_1_09240541/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0924_1_09240541.tar.gz"
SRC_URI[sha256sum] = "994eb7de8f1c0339cf6747f326b5559b44968fad783127b0f8dbc62d89327dcd"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
