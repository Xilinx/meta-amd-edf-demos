SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0805_1_08050715/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0805_1_08050715.tar.gz"
SRC_URI[sha256sum] = "78f170325a6571288a45a6dfb0676d0a9def3611afa5d0f8ec5a9e4562c0b636"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
