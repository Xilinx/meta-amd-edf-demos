SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0806_1_08060629/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0806_1_08060629.tar.gz"
SRC_URI[sha256sum] = "814b6afe689f3d5f2db3b99c2a084ebe8ae8e0dea08cdaca9f6762ff0b5cef4f"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
