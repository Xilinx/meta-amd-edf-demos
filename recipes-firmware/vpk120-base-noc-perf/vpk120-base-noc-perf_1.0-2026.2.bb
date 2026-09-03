SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0903_1_09030751/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0903_1_09030751.tar.gz"
SRC_URI[sha256sum] = "3baa356a438f8b795938a299f6e07b4133a0484cd646283b165ea2d16f29a020"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
