SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0724_1_07241050/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0724_1_07241050.tar.gz"
SRC_URI[sha256sum] = "1d1c165d78bcdfd200101cd68e6bd13ec56e846931ba06612cacfc9932518c3b"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
