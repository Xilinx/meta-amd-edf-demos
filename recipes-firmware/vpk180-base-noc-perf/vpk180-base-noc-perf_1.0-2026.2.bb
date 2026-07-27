SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0727_1_07270924/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0727_1_07270924.tar.gz"
SRC_URI[sha256sum] = "0d6d5db5dd13c821f8ec70650164165acbb3b1e83c69fbb42f844fbd0443496b"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
