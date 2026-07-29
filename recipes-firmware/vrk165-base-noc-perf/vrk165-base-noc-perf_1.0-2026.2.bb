SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0729_1_07291202/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0729_1_07291202.tar.gz"
SRC_URI[sha256sum] = "bf52faaf8ed038ecbef97feb6f2fdea22a732734434202b7a78b2cb9386c0eb3"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
