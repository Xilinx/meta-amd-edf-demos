SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0921_1_09210704/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0921_1_09210704.tar.gz"
SRC_URI[sha256sum] = "4b2d004f2415fb8f48c9029e92bc30ab272462e062ab1bae57b39d8e92ea75ef"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
