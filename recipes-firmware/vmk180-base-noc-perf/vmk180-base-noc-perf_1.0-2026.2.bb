SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0909_1_09090623/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0909_1_09090623.tar.gz"
SRC_URI[sha256sum] = "50cc435b53606de1e2fb25f76be18aa9d6fc7ea8a16f473d94ccc7beb3319492"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
