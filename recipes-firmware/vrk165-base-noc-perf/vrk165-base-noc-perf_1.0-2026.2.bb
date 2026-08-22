SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0822_1_08221012/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0822_1_08221012.tar.gz"
SRC_URI[sha256sum] = "f8ddc30c0013992e5d7f21489c5fa3faf8248877c0f0fd04ad9e704c54fa61ba"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
