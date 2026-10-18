SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1018_1_10180550/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_1018_1_10180550.tar.gz"
SRC_URI[sha256sum] = "24bff8be92a733c7a742ef73078f914a28effad3ed6e1412cc1261b2b517b487"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
