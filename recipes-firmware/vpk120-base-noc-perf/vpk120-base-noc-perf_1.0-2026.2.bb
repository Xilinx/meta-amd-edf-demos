SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0811_1_08110739/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0811_1_08110739.tar.gz"
SRC_URI[sha256sum] = "0bacd49e812f7d1b9ca4e6e3dc421926249911c1320bfc3b14fedcd2567b9222"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
