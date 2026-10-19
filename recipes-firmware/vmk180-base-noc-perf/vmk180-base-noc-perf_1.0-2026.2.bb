SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1019_1_10190543/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_1019_1_10190543.tar.gz"
SRC_URI[sha256sum] = "c6108062325a9607b3a8a9a1d5c40ee38267a2cc8c69123ef463ada1b1046f30"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
