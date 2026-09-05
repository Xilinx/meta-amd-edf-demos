SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0905_1_09050743/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0905_1_09050743.tar.gz"
SRC_URI[sha256sum] = "95f33e8a6d2d609eec6a681ded83abdfe9fb31b12d9e52be8471654d83a560a5"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
