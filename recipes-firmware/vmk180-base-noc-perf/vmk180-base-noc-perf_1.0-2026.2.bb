SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0815_1_08150632/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0815_1_08150632.tar.gz"
SRC_URI[sha256sum] = "b1b870f7958e6df7d9f161e4378b116bb76ae0a990e412506ee361de31bd123b"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
