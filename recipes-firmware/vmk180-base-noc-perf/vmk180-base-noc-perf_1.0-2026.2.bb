SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0925_1_09250529/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0925_1_09250529.tar.gz"
SRC_URI[sha256sum] = "50f5005ffe35a515ba9a1e34ca81cfc1289b5f9b1b366839cd50fbd2acedeb6a"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
