SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0907_1_09070710/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0907_1_09070710.tar.gz"
SRC_URI[sha256sum] = "73ad5a15ab4ba19da2f46481df2964bc0ad387b9a4fe53c39bf79102852deae4"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
