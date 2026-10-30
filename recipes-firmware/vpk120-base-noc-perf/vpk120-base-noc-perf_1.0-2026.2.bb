SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1030_1_10300625/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_1030_1_10300625.tar.gz"
SRC_URI[sha256sum] = "0566cd8452dca702f0d6223cfba64d14f70c2fc61f6010f51906ad8100e0ccea"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
