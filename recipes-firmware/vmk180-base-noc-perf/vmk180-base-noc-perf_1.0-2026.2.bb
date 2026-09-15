SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0915_1_09150548/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0915_1_09150548.tar.gz"
SRC_URI[sha256sum] = "4a0a157e7ad3030b178384c2b369fc40ab9bc40c73bff6958de3555d67cc45ea"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
