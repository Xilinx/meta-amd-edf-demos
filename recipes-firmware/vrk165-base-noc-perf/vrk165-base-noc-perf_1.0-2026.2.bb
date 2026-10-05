SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1005_1_10050713/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_1005_1_10050713.tar.gz"
SRC_URI[sha256sum] = "0998b486d0f77f2f376f6172543628a05779c0d35f5df977a5a6cf6d88b3ff0f"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
