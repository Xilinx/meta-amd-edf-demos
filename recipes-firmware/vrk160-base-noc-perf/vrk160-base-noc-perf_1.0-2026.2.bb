SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0922_1_09220532/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0922_1_09220532.tar.gz"
SRC_URI[sha256sum] = "60ac65d24dcbed4a1cf0d5bc86c36e0f72c8f63eb21de6408e23bedcca91b5ab"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
