SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1024_1_10240546/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_1024_1_10240546.tar.gz"
SRC_URI[sha256sum] = "f40f9823adbda287e2650fb8f22b726a45b0d1fedd0a605ebaf92807b9946a26"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
