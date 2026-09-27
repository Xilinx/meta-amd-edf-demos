SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0927_1_09270540/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0927_1_09270540.tar.gz"
SRC_URI[sha256sum] = "0a270abb992a3bb815d7caa8c0329b919ff8287fb89e8573814ffab1f5f03333"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
