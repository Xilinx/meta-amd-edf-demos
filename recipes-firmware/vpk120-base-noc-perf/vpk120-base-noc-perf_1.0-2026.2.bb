SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1007_1_10070233/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_1007_1_10070233.tar.gz"
SRC_URI[sha256sum] = "da27a80098bd9bd374d3bc20e924c89bcf13320ed67a7684b29d44e79d7d2101"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
