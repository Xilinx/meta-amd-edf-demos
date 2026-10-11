SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1011_1_10110607/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_1011_1_10110607.tar.gz"
SRC_URI[sha256sum] = "6ed31e22eb371e3d1d6926b7cfe0f6f053d619730fd480f87f8c924cc36d8b82"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
