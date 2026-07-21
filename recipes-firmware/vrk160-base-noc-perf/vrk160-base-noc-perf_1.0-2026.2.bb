SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0721_1_07210642/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0721_1_07210642.tar.gz"
SRC_URI[sha256sum] = "d829ccea1078cb06d874bc6d55c6c3d1c98585a5505816c59bb18fcecd050190"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
