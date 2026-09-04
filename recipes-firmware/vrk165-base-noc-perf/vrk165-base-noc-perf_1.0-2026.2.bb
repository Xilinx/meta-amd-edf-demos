SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0904_1_09040838/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0904_1_09040838.tar.gz"
SRC_URI[sha256sum] = "5e754d4d68b341b5de9e9b180cd59ebdc33ba83b7f74a126ab55cac3deed23f4"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
