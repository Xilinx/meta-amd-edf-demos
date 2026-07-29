SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0729_1_07291202/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0729_1_07291202.tar.gz"
SRC_URI[sha256sum] = "b5b28c20bd83869132cef0de1318a6b799b074ff0d09a1fac1c8a1cef8268b90"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
