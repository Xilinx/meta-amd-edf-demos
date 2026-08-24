SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0824_1_08240939/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0824_1_08240939.tar.gz"
SRC_URI[sha256sum] = "d485d7676a00c6337697626bdc776d006ca8f130572fd2eb88ea559f489ba4fc"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
