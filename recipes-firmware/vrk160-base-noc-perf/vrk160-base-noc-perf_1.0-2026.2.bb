SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0730_1_07300857/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0730_1_07300857.tar.gz"
SRC_URI[sha256sum] = "d5cc31b3beeb31b8ff8a35ab76fef9f5981ccc975664e5175b083a20eaab340c"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
