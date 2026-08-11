SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0811_1_08110739/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0811_1_08110739.tar.gz"
SRC_URI[sha256sum] = "427afeb398fa7eae142c1e31eab603efe97cc1fb6963660a1a947798eb936ba9"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
