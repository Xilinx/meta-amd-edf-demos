SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1013_1_10130555/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1013_1_10130555.tar.gz"
SRC_URI[sha256sum] = "85c0c4a86ca60bd213682f067bccc6aa7c7da054874c1a88c4cca5401e9ac0d4"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
