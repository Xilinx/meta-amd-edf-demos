SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1027_1_10270632/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_1027_1_10270632.tar.gz"
SRC_URI[sha256sum] = "c47fe865901d3dcc49921767c4aa546722b5c59d49df968a1bb44b19db138bde"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
