SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1011_1_10110607/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1011_1_10110607.tar.gz"
SRC_URI[sha256sum] = "552cbf15f7aabdf78d4732621ff9a26f47f4a256c17ab97656947b4fecd5e7f5"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
