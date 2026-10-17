SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1017_1_10170604/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_1017_1_10170604.tar.gz"
SRC_URI[sha256sum] = "dba9687d56f87397f4c73a020a36930b04a49bdf97b9a4341782dcd1f522a5a7"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
