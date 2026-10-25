SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1025_1_10250540/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_1025_1_10250540.tar.gz"
SRC_URI[sha256sum] = "2b57caf5bf861675342bd3e3bf9fae4f944dd72ba27c8861f9e619a1daeebf3c"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
