SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1023_1_10230747/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1023_1_10230747.tar.gz"
SRC_URI[sha256sum] = "dfb2513a645009d4a76bccc517de15e5dadd28fb1492864f6cc94f54e8ba9731"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
