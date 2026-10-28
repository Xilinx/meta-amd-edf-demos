SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1028_1_10280834/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_1028_1_10280834.tar.gz"
SRC_URI[sha256sum] = "f8b35766618bfdb9563cee3e4d3f534e1a0770ff19c13097fecb4e5966ab8312"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
