SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1017_1_10170604/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_1017_1_10170604.tar.gz"
SRC_URI[sha256sum] = "bf5e2036bae183e8014b8c487bd765d9c98c071f33e10c6c9f3d00e93edb4b7e"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
