SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0817_1_08170744/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0817_1_08170744.tar.gz"
SRC_URI[sha256sum] = "c9f78a3a94a48f334dc0ad68438e824798bbb400034c8e3cd98de3fcf4fea450"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
