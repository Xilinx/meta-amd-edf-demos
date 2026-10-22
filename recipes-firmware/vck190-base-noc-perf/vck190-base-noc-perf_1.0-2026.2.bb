SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1022_1_10220242/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_1022_1_10220242.tar.gz"
SRC_URI[sha256sum] = "61e244cc9b4324d56154574bb0325b72ffca8fb295f02e4543cd7a9795db821c"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
