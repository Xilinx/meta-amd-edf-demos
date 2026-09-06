SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0906_1_09060734/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0906_1_09060734.tar.gz"
SRC_URI[sha256sum] = "28eb1ea279a8a50cc9dc07e50fff4476f428f50132a962d4102e128c4f0d3aec"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
