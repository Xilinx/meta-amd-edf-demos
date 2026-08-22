SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0822_1_08221012/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0822_1_08221012.tar.gz"
SRC_URI[sha256sum] = "3cc33e8beba66d110654e229726d6c0e5ee0ea85770ba5d5e387c4cdbaeb1767"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
