SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0919_1_09190402/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0919_1_09190402.tar.gz"
SRC_URI[sha256sum] = "3a07e993d9c24cb01aab9da5d7fc7b09d73afd4ececacc186ec6fc949bbf062e"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
