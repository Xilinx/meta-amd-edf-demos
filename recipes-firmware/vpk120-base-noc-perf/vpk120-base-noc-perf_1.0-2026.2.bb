SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0803_1_08030529/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0803_1_08030529.tar.gz"
SRC_URI[sha256sum] = "95faa1207f5c25d846c9e16422fe6fd95cda4b1012c24d158b875fe07439a88a"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
