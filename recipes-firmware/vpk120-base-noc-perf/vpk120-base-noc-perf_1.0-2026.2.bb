SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1103_1_11030216/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_1103_1_11030216.tar.gz"
SRC_URI[sha256sum] = "cf7d76185431f935dc674afe9d6bd1a8f64a9a6e9c939e56c889eedc4adb9e5d"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
