SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0917_1_09170543/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0917_1_09170543.tar.gz"
SRC_URI[sha256sum] = "4191bce151e8d84eed87224f27bd745299d34e860f7d2f4f71d4230e569245fb"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
