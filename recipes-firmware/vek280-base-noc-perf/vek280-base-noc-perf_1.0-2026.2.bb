SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0824_1_08240939/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0824_1_08240939.tar.gz"
SRC_URI[sha256sum] = "219e3af54075c29dec3b6a72b2de27f17656db16e5824984a0205cb000243068"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
