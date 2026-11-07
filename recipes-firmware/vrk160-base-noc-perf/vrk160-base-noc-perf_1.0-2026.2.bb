SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1107_1_11071152/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1107_1_11071152.tar.gz"
SRC_URI[sha256sum] = "923583a25eb1f410d9be2bdae3d88fa62f4311c05d9d7241318efbed3f4a777c"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
