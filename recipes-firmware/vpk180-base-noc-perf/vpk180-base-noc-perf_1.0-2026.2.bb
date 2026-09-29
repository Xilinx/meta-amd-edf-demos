SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0929_1_09291029/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0929_1_09291029.tar.gz"
SRC_URI[sha256sum] = "988316b160503e1f02a7703703cfd33771c202e90aa4c1b76396879783ddc91e"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
