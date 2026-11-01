SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1101_1_11010621/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_1101_1_11010621.tar.gz"
SRC_URI[sha256sum] = "c5b70aca22749933ff3ef08d828ddb033778a12e4ff7c4f3f70b0403ebd08812"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
