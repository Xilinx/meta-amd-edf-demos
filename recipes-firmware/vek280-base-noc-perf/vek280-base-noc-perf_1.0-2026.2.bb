SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0912_1_09120607/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0912_1_09120607.tar.gz"
SRC_URI[sha256sum] = "9a09c43b25dbe878edf1e383b690ec731ec171891ee197dbd01cec563fd0fc3f"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
