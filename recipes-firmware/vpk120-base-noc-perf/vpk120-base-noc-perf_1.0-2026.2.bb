SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0916_1_09160614/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0916_1_09160614.tar.gz"
SRC_URI[sha256sum] = "f87877b4f19aa67f9db9a730d36917be828b1156d2bed8b124a86c3e6005ff46"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
