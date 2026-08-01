SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0801_1_08010632/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0801_1_08010632.tar.gz"
SRC_URI[sha256sum] = "c81741b781fac35e9b69ce170f18e866f79c46c83aa3ad2d9775ab1ba771dd74"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
