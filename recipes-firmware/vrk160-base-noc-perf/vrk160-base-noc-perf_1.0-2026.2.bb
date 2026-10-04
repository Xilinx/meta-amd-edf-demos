SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1004_1_10040624/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1004_1_10040624.tar.gz"
SRC_URI[sha256sum] = "29b821dcb3fdde9b66f43818f96e4abad488abaaaba232f29444fbf32e2318c1"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
