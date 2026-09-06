SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0906_1_09060734/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0906_1_09060734.tar.gz"
SRC_URI[sha256sum] = "23cb4f9d957adce5de93047d0a06b8711c23aae7cdd71adff6ce8f564b76e1e6"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
