SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0803_1_08030529/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0803_1_08030529.tar.gz"
SRC_URI[sha256sum] = "4bf58ab51d33044d69192e8b26c71e1ac1660485d00a32c733267a41698bbcc4"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
