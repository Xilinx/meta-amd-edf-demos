SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0731_1_07310756/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0731_1_07310756.tar.gz"
SRC_URI[sha256sum] = "844256cb00807975c514d07b1b38429437517105a62e41ca1dda554fadbc261b"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
