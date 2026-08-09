SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0809_1_08090727/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0809_1_08090727.tar.gz"
SRC_URI[sha256sum] = "e1e29734bf25c1204bd56d10d6fc1510e8d047599d032bb2965dd3a41dc1b566"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
