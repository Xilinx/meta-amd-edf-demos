SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0809_1_08090727/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0809_1_08090727.tar.gz"
SRC_URI[sha256sum] = "030d41068c901cd603694eb5e7ac90b91acdd45a82f69f010724822e12823ad2"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
