SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1024_1_10240546/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1024_1_10240546.tar.gz"
SRC_URI[sha256sum] = "c1cbeee9aaa65ed0693e704b7b6e01cc7279ebf042fc3be7b5341b594737d67a"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
