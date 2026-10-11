SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1011_1_10110607/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_1011_1_10110607.tar.gz"
SRC_URI[sha256sum] = "f19d34a14b47d109ad075f1f4f055eb8470d97f96af5ace06df37ac2313936b4"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
