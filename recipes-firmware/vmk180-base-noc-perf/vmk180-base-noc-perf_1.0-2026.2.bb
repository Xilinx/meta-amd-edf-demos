SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0810_1_08101825/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0810_1_08101825.tar.gz"
SRC_URI[sha256sum] = "b5f8e08baf5ae5c9d1fb7375d7e53e891d4822f677a2b25ca37d93a6fb591c04"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
