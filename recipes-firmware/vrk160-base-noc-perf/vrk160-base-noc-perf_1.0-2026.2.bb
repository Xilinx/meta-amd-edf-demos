SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1106_1_11060111/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1106_1_11060111.tar.gz"
SRC_URI[sha256sum] = "bd2a90e4b78d1718ca0834798d13464a3bada73f8d47d4e640d9f754eba17a10"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
