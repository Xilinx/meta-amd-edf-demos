SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0731_1_07310756/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0731_1_07310756.tar.gz"
SRC_URI[sha256sum] = "852317410db41f830a9edb7549946ff584c0f7f86c4802dacaa3d67657899322"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
