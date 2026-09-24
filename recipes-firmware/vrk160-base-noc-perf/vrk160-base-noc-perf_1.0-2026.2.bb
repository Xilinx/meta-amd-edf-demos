SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0924_1_09240541/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0924_1_09240541.tar.gz"
SRC_URI[sha256sum] = "a8f037f0c6c665a6d64400fd3adaad53db0ff07163aeaa4113b211e99277c5d8"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
