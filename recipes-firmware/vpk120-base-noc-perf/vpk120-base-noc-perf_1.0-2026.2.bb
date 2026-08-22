SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0822_1_08221012/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0822_1_08221012.tar.gz"
SRC_URI[sha256sum] = "35a7b909dbc04438cef0d64c3af250f499f371a793225d87e035cb1d1a9067dc"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
