SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0908_1_09080452/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0908_1_09080452.tar.gz"
SRC_URI[sha256sum] = "6d99e0a08016b870e6e426d0d61a0a52cb174525175d9a209fd2b86c44574add"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
