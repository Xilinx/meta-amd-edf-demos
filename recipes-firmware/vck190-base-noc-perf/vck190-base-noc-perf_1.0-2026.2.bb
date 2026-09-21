SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0921_1_09210704/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0921_1_09210704.tar.gz"
SRC_URI[sha256sum] = "5bbc3081579cab0efda0378c0a505fe84193fd102d85707887c5e84be784946d"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
