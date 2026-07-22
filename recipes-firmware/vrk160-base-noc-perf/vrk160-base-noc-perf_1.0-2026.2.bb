SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0722_1_07220639/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0722_1_07220639.tar.gz"
SRC_URI[sha256sum] = "086f1c79dd74a0f1d37b271f9d1e71b85328cda00bb3a517da3d1f6bfc86a1e2"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
