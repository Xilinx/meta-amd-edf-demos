SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0927_1_09270540/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0927_1_09270540.tar.gz"
SRC_URI[sha256sum] = "70fc8378e267ef0e4b21a7cb8dff563d26d533301d9cc139c83e55f2efaef44c"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
