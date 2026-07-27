SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0727_1_07270924/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0727_1_07270924.tar.gz"
SRC_URI[sha256sum] = "584d0d3d08b45c1c2a85aa8340c0a619e0fc4f8bf2d35099437221bd3c5a1a36"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
