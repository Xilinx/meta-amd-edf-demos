SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0914_1_09140553/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0914_1_09140553.tar.gz"
SRC_URI[sha256sum] = "744a94e078460273a40f4dfe36b41f813079019db4c6a26e448161edc55aad10"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
