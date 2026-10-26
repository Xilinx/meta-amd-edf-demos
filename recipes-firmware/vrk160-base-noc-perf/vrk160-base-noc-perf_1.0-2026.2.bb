SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1026_1_10260626/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1026_1_10260626.tar.gz"
SRC_URI[sha256sum] = "54c0f7c82ddc8413731ac9e5cc55067fff4ce89f06e536647942e895a021223c"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
