SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1031_1_10310614/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_1031_1_10310614.tar.gz"
SRC_URI[sha256sum] = "4dbd04cad79e2afc8b72682200f04c82d8a002841b33fa48e670abcd33c9a703"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
