SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1030_1_10300625/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1030_1_10300625.tar.gz"
SRC_URI[sha256sum] = "e80f0117682eefccb72db60d8236b36651beae03b7ea358bab13dd69398d74ff"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
