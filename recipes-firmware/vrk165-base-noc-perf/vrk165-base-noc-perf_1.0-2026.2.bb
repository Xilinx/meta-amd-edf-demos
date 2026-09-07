SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0907_1_09070710/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0907_1_09070710.tar.gz"
SRC_URI[sha256sum] = "93d77becf9ac6c1f75b21b0f18c7abc6f9daf07c899ebc9647ab71ebdae60867"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
