SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0816_1_08160737/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0816_1_08160737.tar.gz"
SRC_URI[sha256sum] = "0255e4b4c760d202c397d9cb4235ceca145eb3588aaa55b56e787dc31bf62fe2"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
