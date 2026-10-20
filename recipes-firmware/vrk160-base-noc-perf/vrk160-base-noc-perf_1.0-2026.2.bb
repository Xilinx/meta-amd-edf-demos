SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1020_1_10200613/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1020_1_10200613.tar.gz"
SRC_URI[sha256sum] = "963796572e65f228a0bb0dcca870cbc5397c538b30502ac23052b24a1e0d5946"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
