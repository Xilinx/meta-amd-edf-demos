SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0903_1_09030751/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0903_1_09030751.tar.gz"
SRC_URI[sha256sum] = "6e969dcdce4efcce1e2838433aee50e696b34314499529eb3292f68a43b0fda5"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
