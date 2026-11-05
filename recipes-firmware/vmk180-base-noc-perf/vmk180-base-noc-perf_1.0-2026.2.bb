SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1104_1_11040130/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_1104_1_11040130.tar.gz"
SRC_URI[sha256sum] = "08ac3b76d4a9a7b18aae5863de071ecd141c2db6b1d07ae814238588eb76d9de"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
