SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0726_1_07261002/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0726_1_07261002.tar.gz"
SRC_URI[sha256sum] = "99ef027d945043de72c5e8c75821f1c44e12288f51f8338cb2f3a6dfdc62af1a"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
