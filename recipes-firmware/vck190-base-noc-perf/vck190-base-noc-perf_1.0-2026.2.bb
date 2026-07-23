SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0723_1_07231200/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0723_1_07231200.tar.gz"
SRC_URI[sha256sum] = "b6c486bc5d6e72668bd9f0ed5d2c4714dd3a99fe151e401cb7dbe4d28588db00"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
