SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0805_1_08050715/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0805_1_08050715.tar.gz"
SRC_URI[sha256sum] = "fa997251c5b39fd753bbe0a160bbfa10d45abed09e56df3ffe28fc9deec118f9"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
