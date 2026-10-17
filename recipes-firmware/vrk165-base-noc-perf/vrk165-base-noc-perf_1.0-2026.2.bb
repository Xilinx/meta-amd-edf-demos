SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1017_1_10170604/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_1017_1_10170604.tar.gz"
SRC_URI[sha256sum] = "93f58b076116d7b5031e4e95067fa0089e5837f04f4a37317574a9a6b4106b1a"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
