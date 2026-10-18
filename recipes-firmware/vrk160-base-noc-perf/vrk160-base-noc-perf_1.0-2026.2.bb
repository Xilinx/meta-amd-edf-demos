SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1018_1_10180550/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1018_1_10180550.tar.gz"
SRC_URI[sha256sum] = "a5eefcf82e7267a14669ba37cd2cf5380b1db127b958073bbaa93cdd7ad43fc0"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
