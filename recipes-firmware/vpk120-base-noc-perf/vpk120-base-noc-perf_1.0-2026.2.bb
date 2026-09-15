SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0915_1_09150548/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0915_1_09150548.tar.gz"
SRC_URI[sha256sum] = "4e1b0ba82634956690541b96c0965df4a629d570a2c408fb262a4fc106c1b072"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
