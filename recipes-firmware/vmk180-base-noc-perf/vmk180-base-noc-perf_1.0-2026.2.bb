SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1010_1_10100535/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_1010_1_10100535.tar.gz"
SRC_URI[sha256sum] = "7733a244816e6227665fbf86f90bfb768906a461c5b1b0cdf31369962d84d51d"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
