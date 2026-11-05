SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1104_1_11040130/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_1104_1_11040130.tar.gz"
SRC_URI[sha256sum] = "82506f8652edda62a1b9bdca1eb3e289059dd21867a873274bc7c948f8625220"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
