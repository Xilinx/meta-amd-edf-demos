SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0731_1_07310756/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0731_1_07310756.tar.gz"
SRC_URI[sha256sum] = "2c2b142ff80fa920e3948cf4b91ba2c8813d8ba25b6cbe0a7fd5264b5a934174"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
