SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0929_1_09290125/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0929_1_09290125.tar.gz"
SRC_URI[sha256sum] = "51f375d9efbbf06d9929da4948d7d742ea2dcafe2ba2bda292df5d84c06cbae9"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
