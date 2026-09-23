SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0923_1_09230529/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0923_1_09230529.tar.gz"
SRC_URI[sha256sum] = "b2e3c0810b6a3cf890a7a3de044603c08fad31abd6a7fca970f3f75c7b6a4e35"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
