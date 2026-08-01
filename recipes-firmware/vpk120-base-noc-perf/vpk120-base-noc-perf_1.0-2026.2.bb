SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0801_1_08010632/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0801_1_08010632.tar.gz"
SRC_URI[sha256sum] = "b995e0c44474b1733b5da8cf657a061ba6bf5a319d13eb12667c1c23403e6d3d"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
