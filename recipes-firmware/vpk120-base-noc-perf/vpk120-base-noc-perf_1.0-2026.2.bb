SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1001_1_10010725/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_1001_1_10010725.tar.gz"
SRC_URI[sha256sum] = "88a9d571ceb8e25f359bb620d860b4e71271adbf5a3eb620fd80779129ca0c21"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
