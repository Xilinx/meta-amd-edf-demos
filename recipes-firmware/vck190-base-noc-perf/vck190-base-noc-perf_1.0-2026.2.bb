SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0927_1_09270540/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0927_1_09270540.tar.gz"
SRC_URI[sha256sum] = "cc0fe040a45809d080412485f97b0341206499b0887f34921011c4ac787464c5"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
