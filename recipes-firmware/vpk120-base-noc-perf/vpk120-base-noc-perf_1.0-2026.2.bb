SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1102_1_11020153/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_1102_1_11020153.tar.gz"
SRC_URI[sha256sum] = "5e64e882884ada3dc8cd74629346eb06e857df332e4d4d1042100fa91854d78d"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
