SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0929_1_09291029/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0924_1_09291029.tar.gz"
SRC_URI[sha256sum] = "fcd99fa9aa97f383b303821ddc096ae4ceeee3563efd1196feee4067647ff793"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
