SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0907_1_09070710/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0907_1_09070710.tar.gz"
SRC_URI[sha256sum] = "5912a8b76eb1edf48574cbf068caa27ed3ae5b2bc03f869b276a53ef969c6a11"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
