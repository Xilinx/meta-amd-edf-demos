SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1005_1_10050713/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_1005_1_10050713.tar.gz"
SRC_URI[sha256sum] = "ef1fd195816052d7765534bacb13f225e36aa27a31d715bf323c2d9a20e17897"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
