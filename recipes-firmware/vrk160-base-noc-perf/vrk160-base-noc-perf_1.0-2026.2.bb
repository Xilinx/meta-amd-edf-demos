SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0920_1_09200102/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0920_1_09200102.tar.gz"
SRC_URI[sha256sum] = "7ef92aa582b54cc5f603f50230ccd7ad2006c0d6e953857b479c5dc129156ae1"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
