SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0817_1_08170744/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0817_1_08170744.tar.gz"
SRC_URI[sha256sum] = "526e20f480c7878c6711c0813077bb733e1111e974df3345cbc8c06fa23124a6"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
