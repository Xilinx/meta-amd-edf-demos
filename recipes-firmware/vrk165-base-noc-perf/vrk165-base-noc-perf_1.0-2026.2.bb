SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1106_1_11060111/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_1106_1_11060111.tar.gz"
SRC_URI[sha256sum] = "2df18c294fe111aed4dd112855c833c294aa99e72469cda4563f9917d93a55ff"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
