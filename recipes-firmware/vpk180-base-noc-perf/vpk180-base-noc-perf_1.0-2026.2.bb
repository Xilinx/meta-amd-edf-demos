SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1002_1_10030743/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_1002_1_10030743.tar.gz"
SRC_URI[sha256sum] = "8d4847be51cb14e4fa02bf34388dd61cd3f32131bf564688b665b304c106d637"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
