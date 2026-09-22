SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0922_1_09220532/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0922_1_09220532.tar.gz"
SRC_URI[sha256sum] = "c59ed91c919237089e01bc86663d4519a0ba5a9bc61f841c355591d8ec094a79"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
