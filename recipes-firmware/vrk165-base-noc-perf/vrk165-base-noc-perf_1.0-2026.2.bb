SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0915_1_09150548/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0915_1_09150548.tar.gz"
SRC_URI[sha256sum] = "a972f0c340a7b5e07d0770615a57e9e2f86e2193df2d6843c434f97b2c833dbb"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
