SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0816_1_08160737/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0816_1_08160737.tar.gz"
SRC_URI[sha256sum] = "a91e726bd69246fa45d79abff088e1e3d647cc6a2d12eeef0f6bddce19bab8a5"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
