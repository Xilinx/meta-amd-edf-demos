SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0815_1_08150632/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0815_1_08150632.tar.gz"
SRC_URI[sha256sum] = "4bed6eebba89abaa91df03baf5870c8ad8a8b90192f0f8186def3378ad7a4b67"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
