SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0728_1_07280851/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0728_1_07280851.tar.gz"
SRC_URI[sha256sum] = "a14721124a46c37e5392503aa12707a5cb7b6931f869b1ed01095be23e6402c4"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
