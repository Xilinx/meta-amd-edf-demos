SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1027_1_10270632/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_1027_1_10270632.tar.gz"
SRC_URI[sha256sum] = "3eee0136c0c16680ff69d1153dd03304d2b5e778f3482561a4e418325d5139b5"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
