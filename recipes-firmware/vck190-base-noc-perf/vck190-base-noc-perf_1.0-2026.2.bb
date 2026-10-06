SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1006_1_10060656/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_1006_1_10060656.tar.gz"
SRC_URI[sha256sum] = "bea4dd36e6f3478bf189a7f9ca972205a3a48f6153072660835f8c84d85e8237"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
