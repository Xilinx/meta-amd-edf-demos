SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0801_1_08010632/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0801_1_08010632.tar.gz"
SRC_URI[sha256sum] = "2c0a7eaa32b105c43971457578851e3724ff1445899b92c831bb06c8e6424a04"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
