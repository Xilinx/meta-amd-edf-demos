SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0905_1_09050743/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0905_1_09050743.tar.gz"
SRC_URI[sha256sum] = "d4ae9ea525a55146694907b39c3efdfd7c5af9148f23659089203729fd20402c"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
