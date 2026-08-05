SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0805_1_08050715/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0805_1_08050715.tar.gz"
SRC_URI[sha256sum] = "f2e8c7b4a32ba998893529c59b901f1e7d027940835b85b84e5069fe78d4d626"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
