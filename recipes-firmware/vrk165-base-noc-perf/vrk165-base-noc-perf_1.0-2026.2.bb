SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0920_1_09200102/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0920_1_09200102.tar.gz"
SRC_URI[sha256sum] = "8d65ea7bfc33feee3112faaede20933f73b3d996edafae205beb7fd4a185b96b"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
