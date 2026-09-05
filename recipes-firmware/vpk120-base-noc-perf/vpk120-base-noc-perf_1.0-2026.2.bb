SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0905_1_09050743/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0905_1_09050743.tar.gz"
SRC_URI[sha256sum] = "08012bb0770ca899c2dc663df07d477d0a03acfc459f10330c04c6e1fb264e9b"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
