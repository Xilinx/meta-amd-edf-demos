SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1018_1_10180550/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_1018_1_10180550.tar.gz"
SRC_URI[sha256sum] = "07613705314afaa6a96533e71bea1654b6e0e7c89e94f69f7c58a504b59d06ea"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
