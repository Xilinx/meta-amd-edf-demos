SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0723_1_07231200/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0723_1_07231200.tar.gz"
SRC_URI[sha256sum] = "3653268d27c239926c899d355a50c3b67a18e3786ed0668b2a5ec04301f2dcac"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
