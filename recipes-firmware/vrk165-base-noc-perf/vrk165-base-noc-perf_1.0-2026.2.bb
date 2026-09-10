SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0910_1_09100633/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0910_1_09100633.tar.gz"
SRC_URI[sha256sum] = "e91e10d4f057cd93a6eb975e2fcc6dff1e658a19b5f28940e7e4e7b6bff4a52d"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
