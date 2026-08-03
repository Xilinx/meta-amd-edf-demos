SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0803_1_08030529/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0803_1_08030529.tar.gz"
SRC_URI[sha256sum] = "1a806195ee1c935328714d7101e741d9d99a11c19911f298a395379cb8e561d6"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
