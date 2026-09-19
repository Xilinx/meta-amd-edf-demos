SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0919_1_09190402/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0919_1_09190402.tar.gz"
SRC_URI[sha256sum] = "b013e549dadaa7919c5f25f5c04bba577ec6b4c81078bcaba29097ca80ffcbaf"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
