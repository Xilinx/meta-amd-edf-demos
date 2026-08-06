SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0806_1_08060629/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0806_1_08060629.tar.gz"
SRC_URI[sha256sum] = "fdaf30d2e1a3a643a2bcaebd445ec8c931f214f95ff57d954d639a941a233a98"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
