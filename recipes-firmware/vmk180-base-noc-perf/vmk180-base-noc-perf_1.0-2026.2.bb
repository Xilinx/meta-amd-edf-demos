SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1016_1_10160545/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_1016_1_10160545.tar.gz"
SRC_URI[sha256sum] = "d5e9e5e80cefbe6bec2ce844073d7685d6923457e3075a0bd8313432251e6477"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
