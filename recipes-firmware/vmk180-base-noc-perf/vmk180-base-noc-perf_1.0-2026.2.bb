SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0928_1_09280533/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0928_1_09280533.tar.gz"
SRC_URI[sha256sum] = "53e36fd671d8ce3c9b7d4df742a26f909ebedfc159d9b31c3f1787c131608108"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
