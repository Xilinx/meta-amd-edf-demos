SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0811_1_08110739/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0811_1_08110739.tar.gz"
SRC_URI[sha256sum] = "69e4045864603134150a15b81d74fa9ff1ccbb334620011699499e26837c2b97"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
