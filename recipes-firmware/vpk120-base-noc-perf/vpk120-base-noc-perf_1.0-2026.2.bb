SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0906_1_09060734/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0906_1_09060734.tar.gz"
SRC_URI[sha256sum] = "d7a64020a64a0bd53e54d07ae6b60c267e8aa19eb65f892d84eaef4f5472b1c9"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
