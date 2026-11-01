SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1101_1_11010621/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1101_1_11010621.tar.gz"
SRC_URI[sha256sum] = "131d81e991851b943edc3043caa79d65762291aa3484ff1034d37ed5e7baeb6f"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
