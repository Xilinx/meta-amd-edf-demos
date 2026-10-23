SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1023_1_10230747/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_1023_1_10230747.tar.gz"
SRC_URI[sha256sum] = "865686efe5d335506fa988ad1b7a0e64fd12d0d94673d477ad0bef9949f70115"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
