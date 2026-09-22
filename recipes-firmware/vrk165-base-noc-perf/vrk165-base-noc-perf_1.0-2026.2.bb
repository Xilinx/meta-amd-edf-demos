SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0922_1_09220532/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0922_1_09220532.tar.gz"
SRC_URI[sha256sum] = "59304cd3d9de4363565ad0c1b928e06009844ba25f16e55bc77a785fcc278b88"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
