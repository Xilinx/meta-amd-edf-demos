SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0731_1_07310756/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0731_1_07310756.tar.gz"
SRC_URI[sha256sum] = "fc55f42ab635b119f8919662eb5586c0eeb39a3cfce495697004177811c5b07e"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
