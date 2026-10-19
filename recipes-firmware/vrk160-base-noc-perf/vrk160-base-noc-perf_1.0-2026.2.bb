SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1019_1_10190543/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1019_1_10190543.tar.gz"
SRC_URI[sha256sum] = "4b204af55268454114edc02fddb9f51eebea147db80c05102e961273e21dfa39"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
