SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0823_1_08230755/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0823_1_08230755.tar.gz"
SRC_URI[sha256sum] = "f8ade09bc70ba85947f5e539034c52c1b2763a548e200f3e0c090ff625581627"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
