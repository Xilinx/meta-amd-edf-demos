SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0806_1_08060629/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0806_1_08060629.tar.gz"
SRC_URI[sha256sum] = "ad11e4759985444ff00286294331216299eff6fb1a17ad6fb0dc4f54647fe7c6"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
