SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1009_1_10090707/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_1009_1_10090707.tar.gz"
SRC_URI[sha256sum] = "f496aa05856e84a6471eb3a115cd3bd5c85a683f8738c74ca28bdd2afce4623a"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
