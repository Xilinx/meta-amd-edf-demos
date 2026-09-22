SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0922_1_09220532/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0922_1_09220532.tar.gz"
SRC_URI[sha256sum] = "6782b1e4ed8772ddd218c6132e0aa144c16e36136f89bf6f08df54a4faa50df0"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
