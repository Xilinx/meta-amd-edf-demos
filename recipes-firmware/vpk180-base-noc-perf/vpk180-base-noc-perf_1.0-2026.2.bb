SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1011_1_10110607/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_1011_1_10110607.tar.gz"
SRC_URI[sha256sum] = "2c8da24228829c5b2bc3bf5829bbb29196242f1fd0624656006e3455dac9a6e1"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
