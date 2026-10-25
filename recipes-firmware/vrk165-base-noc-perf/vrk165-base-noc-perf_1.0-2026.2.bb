SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1025_1_10250540/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_1025_1_10250540.tar.gz"
SRC_URI[sha256sum] = "ad12c2efc259df35b051ffcb018119fd8d7cc872bfdefcbd122ce60cb997300c"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
