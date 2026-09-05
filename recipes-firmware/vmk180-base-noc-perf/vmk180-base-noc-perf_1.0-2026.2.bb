SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0905_1_09050743/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0905_1_09050743.tar.gz"
SRC_URI[sha256sum] = "259c6bf193acdd411e7f9fe42ef5763177d02f35f7594a15a6ad1206ac7c992a"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
