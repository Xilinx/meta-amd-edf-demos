SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0727_1_07270924/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0727_1_07270924.tar.gz"
SRC_URI[sha256sum] = "57f8ea11c1834e42f345a5c708d8adbb7a44555a6ab391be4dfe04c9c28c2fe4"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
