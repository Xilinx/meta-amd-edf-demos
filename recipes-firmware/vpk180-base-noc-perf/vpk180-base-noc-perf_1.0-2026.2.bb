SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1102_1_11020153/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_1102_1_11020153.tar.gz"
SRC_URI[sha256sum] = "4c810969e6060d2a743fd686aaf268b79f9f57fac8f11b415e68927d5fe3dfe4"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
