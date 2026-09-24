SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0924_1_09240541/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0924_1_09240541.tar.gz"
SRC_URI[sha256sum] = "a7cd978b86a1425894ab8d648cdac1bfff25aaa0236b07b907fd18999c93d24e"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
