SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1010_1_10100535/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_1010_1_10100535.tar.gz"
SRC_URI[sha256sum] = "0ce3cc3e3c1afc43c48ace4a651ba0c12be5e5c5813df8d8b19c054ea310235e"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
