SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0822_1_08221012/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0822_1_08221012.tar.gz"
SRC_URI[sha256sum] = "08718877538c8c57b34ecfe4a53ffc74b7eb9657e3e6b0a1b31b783ef1e18024"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
