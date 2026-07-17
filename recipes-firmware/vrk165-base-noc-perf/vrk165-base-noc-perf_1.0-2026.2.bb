SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0716_1_07160732/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0716_1_07160732.tar.gz"
SRC_URI[sha256sum] = "4d56ffb52fd7b4f757decf87cd6d6881916a82030bab29ce102a662a35bc5582"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
