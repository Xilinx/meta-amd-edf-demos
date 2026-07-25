SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0725_1_07251404/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0725_1_07251404.tar.gz"
SRC_URI[sha256sum] = "e03e35d1feff29b7053e9d7935630fc81ade91f9885878e00f60fa4b33cfb0ff"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
