SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0812_1_08120803/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0812_1_08120803.tar.gz"
SRC_URI[sha256sum] = "d5d3c9ab4cade96b421b4169aaf7905963522a5573d62eac524ef3a4643166b0"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
