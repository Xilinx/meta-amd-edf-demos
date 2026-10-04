SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1004_1_10040624/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_1004_1_10040624.tar.gz"
SRC_URI[sha256sum] = "3c15bdd24f1afd974513d76e4a3e9d0afe97cce0f7ee052e9ca45ee1467bc138"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
