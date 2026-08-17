SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0817_1_08170744/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0817_1_08170744.tar.gz"
SRC_URI[sha256sum] = "5a651e2a566c4de5dd1aaf722278a35d2f872954ffc717a378c5c179f74bfb24"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
