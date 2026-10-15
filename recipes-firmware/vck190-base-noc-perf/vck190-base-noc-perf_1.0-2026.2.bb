SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1015_1_10150534/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_1015_1_10150534.tar.gz"
SRC_URI[sha256sum] = "f4c2d7dd6bf7b8370051613d29a248c7ec4e49248cd7f5877703289ecb8d857e"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
