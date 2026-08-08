SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0808_1_08080727/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0808_1_08080727.tar.gz"
SRC_URI[sha256sum] = "5da32f0191003a17824aed9282a9b38a5c2ce22a7bcaaac095a848d6481f98c8"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
