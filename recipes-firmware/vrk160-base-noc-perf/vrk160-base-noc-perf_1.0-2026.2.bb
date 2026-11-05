SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1104_1_11040130/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1104_1_11040130.tar.gz"
SRC_URI[sha256sum] = "a3dea5a6e33f726a542136bb9d1345f17d109e2ac3af860904bc1314bc2e52d4"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
