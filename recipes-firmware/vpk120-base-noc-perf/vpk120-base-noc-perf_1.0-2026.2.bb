SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0918_1_09180636/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0918_1_09180636.tar.gz"
SRC_URI[sha256sum] = "6006a4093f221c50886496ada24efb60750546ff00382adfc457f809cc4afa12"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
