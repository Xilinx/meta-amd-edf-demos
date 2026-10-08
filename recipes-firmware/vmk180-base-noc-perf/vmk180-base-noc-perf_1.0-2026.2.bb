SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1008_1_10080546/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_1008_1_10080546.tar.gz"
SRC_URI[sha256sum] = "b5615a70318dd81776f1e1dbed381a488e1b5a5a747dff14cf28054711347ad9"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
