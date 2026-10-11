SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1011_1_10110607/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_1011_1_10110607.tar.gz"
SRC_URI[sha256sum] = "4931c146f749322da6b9e7d18a75858b480953fcc83586b80dd27740f03f749f"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
