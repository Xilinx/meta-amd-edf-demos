SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0725_1_07251404/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0725_1_07251404.tar.gz"
SRC_URI[sha256sum] = "cad83087f437ed3a24e47eec47fb344de3b889e6032eb1873038856d373e8acb"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
