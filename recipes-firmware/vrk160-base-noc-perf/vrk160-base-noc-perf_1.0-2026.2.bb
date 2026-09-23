SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0923_1_09230529/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0923_1_09230529.tar.gz"
SRC_URI[sha256sum] = "eeefcab75ddab0dedeca83eb810ffacd3ec2806794af7ee923d125449f268a0b"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
