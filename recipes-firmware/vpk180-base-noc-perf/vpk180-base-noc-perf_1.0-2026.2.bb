SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1013_1_10130555/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_1013_1_10130555.tar.gz"
SRC_URI[sha256sum] = "92c1e7b8b264399ab458667370d2afefad76a403166a74bed1d3887a63c5b462"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
