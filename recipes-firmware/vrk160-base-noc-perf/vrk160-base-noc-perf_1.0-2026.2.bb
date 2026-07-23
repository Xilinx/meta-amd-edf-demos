SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0723_1_07231200/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0723_1_07231200.tar.gz"
SRC_URI[sha256sum] = "761d72ea9671c5005234d5140104666dc9221ef15eae424c1c98dee2e940c144"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
