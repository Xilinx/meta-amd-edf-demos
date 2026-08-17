SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0817_1_08170744/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0817_1_08170744.tar.gz"
SRC_URI[sha256sum] = "3058e3b82c85b8f7de66491d6ce7a335256b131974fbb84f7a3da0e21eaaf885"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
