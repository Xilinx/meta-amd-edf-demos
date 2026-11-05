SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1104_1_11040130/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_1104_1_11040130.tar.gz"
SRC_URI[sha256sum] = "6a5462f38adadf76a910d7a62ff7032b50d0938a439c06de5ae6a570d0d95e62"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
