SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1010_1_10100535/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1010_1_10100535.tar.gz"
SRC_URI[sha256sum] = "57c54ec1476f5b659515f218490e8f2d2b477fd71c46c1c4e390065ad9f12ef1"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
