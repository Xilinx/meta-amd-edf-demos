SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1004_1_10040624/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_1004_1_10040624.tar.gz"
SRC_URI[sha256sum] = "967e358b13eedd4fea1320c520277ecc22926e17253779908c9b0bd496e54fcc"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
