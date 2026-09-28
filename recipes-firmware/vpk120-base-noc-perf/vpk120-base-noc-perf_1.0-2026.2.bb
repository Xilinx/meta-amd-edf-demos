SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0928_1_09280533/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0928_1_09280533.tar.gz"
SRC_URI[sha256sum] = "c7c7ce02f5ce58ecc7a8a235778e2c16b4a0244c18e0bb372036a4e809c4e90d"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
