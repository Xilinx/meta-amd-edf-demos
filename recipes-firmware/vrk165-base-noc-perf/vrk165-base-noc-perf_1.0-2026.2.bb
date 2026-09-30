SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0930_1_09300557/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0924_1_09300557.tar.gz"
SRC_URI[sha256sum] = "e8b2cf5b37017f52e95fc1fcf04605099301debc4a6ab06cbb45a53248a843be"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
