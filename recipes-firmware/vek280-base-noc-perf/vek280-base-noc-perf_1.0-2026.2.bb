SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0810_1_08101825/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0810_1_08101825.tar.gz"
SRC_URI[sha256sum] = "cb9168e1b21819b9a3aee74f4e32cef05386ff9fefe8a13826e754f1c4c76bea"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
