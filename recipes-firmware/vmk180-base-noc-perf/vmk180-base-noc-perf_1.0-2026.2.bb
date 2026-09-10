SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0910_1_09100633/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0910_1_09100633.tar.gz"
SRC_URI[sha256sum] = "c0d19bd62b6efd49375cde38551d8cb720dd29f115345c38bb9ed3518dd9c4b7"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
