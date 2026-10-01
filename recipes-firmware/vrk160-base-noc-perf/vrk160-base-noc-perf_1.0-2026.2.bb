SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1001_1_10010725/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1001_1_10010725.tar.gz"
SRC_URI[sha256sum] = "332b8a2b6e3421e699ce3cdd240f2a5c2474773e734678d599c3e4f4f33803df"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
