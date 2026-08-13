SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0813_1_08130450/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0813_1_08130450.tar.gz"
SRC_URI[sha256sum] = "7ec22b4fcdf6fa9dfcba60ec6496165758fc136e34c27fb14abbd4f73c165dda"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
