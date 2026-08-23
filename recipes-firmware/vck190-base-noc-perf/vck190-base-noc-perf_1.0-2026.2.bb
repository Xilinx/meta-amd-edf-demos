SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0823_1_08230755/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0823_1_08230755.tar.gz"
SRC_URI[sha256sum] = "53e7da258fc26cdeaca809233aeadaf29cca75a0137764b0f16540083b3c7f63"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
