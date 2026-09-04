SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0904_1_09040838/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0904_1_09040838.tar.gz"
SRC_URI[sha256sum] = "23e309507872870b9350d961e7fbecc997ef13b2cf185aab9d8345341834a556"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
