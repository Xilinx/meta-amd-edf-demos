SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0919_1_09190402/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0919_1_09190402.tar.gz"
SRC_URI[sha256sum] = "6fec181f15202b3d022ea96ad2c2772972c2fc2ece9e47c8ed59eacf0c15e9c2"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
