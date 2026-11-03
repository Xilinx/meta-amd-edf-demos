SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1103_1_11030216/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_1103_1_11030216.tar.gz"
SRC_URI[sha256sum] = "ad176b582a45f2e7166e383e37e1c842fdc38cc3dbae4820c92421d73cccce08"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
