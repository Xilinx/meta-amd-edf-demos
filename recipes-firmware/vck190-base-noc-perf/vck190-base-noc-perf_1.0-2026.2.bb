SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1008_1_10080546/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_1008_1_10080546.tar.gz"
SRC_URI[sha256sum] = "deeece62f7e1c8467d1f20b83858567c7bd064dfed23e2410319b09ad0422803"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
