SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1013_1_10130555/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_1013_1_10130555.tar.gz"
SRC_URI[sha256sum] = "b8344f79c3e8c9b1f850747f8e6cfea1ebf769241bdcadb841fd64ab4f7fb613"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
