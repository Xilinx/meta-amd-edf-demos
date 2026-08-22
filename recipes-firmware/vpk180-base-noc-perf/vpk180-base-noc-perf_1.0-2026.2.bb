SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0822_1_08221012/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0822_1_08221012.tar.gz"
SRC_URI[sha256sum] = "0e5a41087fc0eb9643d2c1306e0738998d364da44cd5c173217715f8a2ee05ad"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
