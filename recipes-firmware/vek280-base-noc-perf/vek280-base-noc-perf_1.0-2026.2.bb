SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0925_1_09250529/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0925_1_09250529.tar.gz"
SRC_URI[sha256sum] = "fab32996ea4a57f11e91db2ad0d71a7c3727ac23dc97bc1991c623c6eb329586"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
