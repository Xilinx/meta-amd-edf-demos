SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0925_1_09250529/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0925_1_09250529.tar.gz"
SRC_URI[sha256sum] = "60d4601ebf5c872e165da50427c37a3739efb124034d5f1eb5a841cd88ab6a76"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
