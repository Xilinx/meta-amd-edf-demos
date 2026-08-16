SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0816_1_08160737/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0816_1_08160737.tar.gz"
SRC_URI[sha256sum] = "c58ce3f748e2a5d2abccf3e6376a6d5e82a20e6dbe8575f544b79a22c256e64e"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
