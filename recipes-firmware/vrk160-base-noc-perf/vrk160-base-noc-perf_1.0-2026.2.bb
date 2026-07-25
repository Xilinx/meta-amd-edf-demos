SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0725_1_07251404/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0725_1_07251404.tar.gz"
SRC_URI[sha256sum] = "66846a827a3f4095d38baf0ef4832d33a3a34cfe30ac155e0e9d661fb4c1384e"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
