SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1020_1_10200613/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_1020_1_10200613.tar.gz"
SRC_URI[sha256sum] = "ac0b8b80b81f487e7e3bd85e00a38d715c773f80124cfb6832c289e4208f4a15"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
