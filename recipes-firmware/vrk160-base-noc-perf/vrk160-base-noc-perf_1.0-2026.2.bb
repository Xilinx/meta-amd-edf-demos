SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0716_1_07160732/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0716_1_07160732.tar.gz"
SRC_URI[sha256sum] = "07e0d9a9b33afa48201bd789942f4b9a1a2410f013e19943224e1735e74d01a3"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
