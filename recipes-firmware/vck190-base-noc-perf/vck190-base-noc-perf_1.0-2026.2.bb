SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0907_1_09070710/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0907_1_09070710.tar.gz"
SRC_URI[sha256sum] = "4163f350f49fd5c9a79eb9267b5e4bee99d15b3ba9a3bf2cc40722b4726bc34b"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
