SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1015_1_10150534/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_1015_1_10150534.tar.gz"
SRC_URI[sha256sum] = "d9c451664a7facc8719d18f36aec8dc3c94a090d1c2ff210523acaa72596459f"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
