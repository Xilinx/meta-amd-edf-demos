SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0716_1_07160732/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0716_1_07160732.tar.gz"
SRC_URI[sha256sum] = "afea20097d7a87401895e3a728734b63be8a5cfbde1f4e2567e52775980adf52"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
