SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1106_1_11060111/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_1106_1_11060111.tar.gz"
SRC_URI[sha256sum] = "05ff24b759f812f0a3c9323a609e8d8af0e925bf5c2b6c6af9d260cdbd5d57e2"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
