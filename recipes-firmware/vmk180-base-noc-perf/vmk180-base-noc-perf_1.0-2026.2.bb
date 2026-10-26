SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1026_1_10260626/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_1026_1_10260626.tar.gz"
SRC_URI[sha256sum] = "d8f0d48f49b9fa847789ddb9b881161d1ba24f46901008219da60e3e50e3f86d"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
