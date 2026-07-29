SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0729_1_07291202/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0729_1_07291202.tar.gz"
SRC_URI[sha256sum] = "09198d58157b946aee5f34e0065b03c7a87dfbc7425a03274f12b0c4cc3baa6b"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
