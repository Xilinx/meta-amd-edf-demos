SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0918_1_09180636/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0918_1_09180636.tar.gz"
SRC_URI[sha256sum] = "8b39feb54af727ebdf8bad932524abe76e2822fa89d36beb80b6d54eb3c69a75"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
