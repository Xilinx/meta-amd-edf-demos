SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1007_1_10070233/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_1007_1_10070233.tar.gz"
SRC_URI[sha256sum] = "6b8761e4a6f2e59e06c7a2caf07dd5ed00942b1850ea1a296be59d0cb324a6da"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
