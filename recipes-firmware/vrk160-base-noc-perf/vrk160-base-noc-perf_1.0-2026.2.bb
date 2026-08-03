SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0803_1_08030529/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0803_1_08030529.tar.gz"
SRC_URI[sha256sum] = "c4f3ee37f05ac7660a3b1d79982a63e4b0d0b6d9e150528be57f4edce095b1b3"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
