SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1106_1_11060111/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_1106_1_11060111.tar.gz"
SRC_URI[sha256sum] = "c6047913d97d18cdc85a1febeff59d8c8740c4d1a9c601f7884fea0fdc0dad98"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
