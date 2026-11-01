SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1101_1_11010621/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_1101_1_11010621.tar.gz"
SRC_URI[sha256sum] = "c9ba44bae3b3f89ecd2ee8eff7e1b1ece4fd2ac19bb871fad4bc37109a4236be"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
