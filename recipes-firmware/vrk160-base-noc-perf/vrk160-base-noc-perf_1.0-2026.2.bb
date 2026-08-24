SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0824_1_08240939/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0824_1_08240939.tar.gz"
SRC_URI[sha256sum] = "5bd01c74a48fb9d358d669101c36188cd5ae381813952e0ab231658765c35f08"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
