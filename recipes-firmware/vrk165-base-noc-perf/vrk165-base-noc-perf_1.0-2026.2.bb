SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0730_1_07300857/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0730_1_07300857.tar.gz"
SRC_URI[sha256sum] = "db137759d74d6f60a7578b970782dcd8ecbf186c3a01b1a9cdfb63e5cbeeba28"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
