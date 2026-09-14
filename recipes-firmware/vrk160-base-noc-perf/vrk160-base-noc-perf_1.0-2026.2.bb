SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0914_1_09140553/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0914_1_09140553.tar.gz"
SRC_URI[sha256sum] = "a5c85446ffd11903c2cad533ec3bbe0a47380c8e82ef0da0a756ebdddd35e94c"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
