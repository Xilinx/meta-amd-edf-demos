SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1102_1_11020153/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1102_1_11020153.tar.gz"
SRC_URI[sha256sum] = "fdd767f6e6d795168093409e0cb3b9ae9b51870210149efd3947417af8317a86"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
