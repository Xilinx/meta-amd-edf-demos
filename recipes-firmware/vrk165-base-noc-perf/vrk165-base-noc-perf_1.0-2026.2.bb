SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0728_1_07280851/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0728_1_07280851.tar.gz"
SRC_URI[sha256sum] = "fb5a1cefbd4309bd6d6fdc74f76d8b6f95b8d1e63473ce08d7b514887923efe1"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
