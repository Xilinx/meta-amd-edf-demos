SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0805_1_08050715/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0805_1_08050715.tar.gz"
SRC_URI[sha256sum] = "e8bc34619a8bdec1db43108dfda86ee2009ef649c27bcf66619ad01c8effc1e7"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
