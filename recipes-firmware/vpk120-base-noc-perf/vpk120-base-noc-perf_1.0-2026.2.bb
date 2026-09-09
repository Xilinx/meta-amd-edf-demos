SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0909_1_09090623/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0909_1_09090623.tar.gz"
SRC_URI[sha256sum] = "e3f6ee642628f41ac6183a7ef37e5e293cbc2a674df5d9420ba08c54e164a8ef"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
