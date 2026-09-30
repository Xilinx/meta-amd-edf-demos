SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0930_1_09300557/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0924_1_09300557.tar.gz"
SRC_URI[sha256sum] = "0c61c5fdbaca6934f4339e79e95295cc1fdb483c3aecad3c3766b3e110eae8a9"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
