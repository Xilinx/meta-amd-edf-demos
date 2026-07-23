SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0723_1_07231200/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0723_1_07231200.tar.gz"
SRC_URI[sha256sum] = "a4c0b495b196c7ca8091c370f9152eca94e01f6884d5ff08210b58426fa8ba35"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
