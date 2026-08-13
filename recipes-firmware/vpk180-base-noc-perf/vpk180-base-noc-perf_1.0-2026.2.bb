SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0813_1_08130450/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0813_1_08130450.tar.gz"
SRC_URI[sha256sum] = "a25a774559096213ff12b19a046f0d6e4e250014dac8358a9307d56199779052"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
