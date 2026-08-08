SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0808_1_08080727/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0808_1_08080727.tar.gz"
SRC_URI[sha256sum] = "667ca1cd16f6967575d87568112afecb7d06f0ac57dfc4773290d71f60ff5a5e"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
