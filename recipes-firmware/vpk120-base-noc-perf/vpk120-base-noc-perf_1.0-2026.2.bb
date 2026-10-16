SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1016_1_10160545/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_1016_1_10160545.tar.gz"
SRC_URI[sha256sum] = "8e71e449164f555b0a3a6e76ac0f97746e4ef2f3ba6dc811861170a1e9a7c0d9"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
