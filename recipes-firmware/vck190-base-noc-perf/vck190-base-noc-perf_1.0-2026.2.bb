SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1030_1_10300625/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_1030_1_10300625.tar.gz"
SRC_URI[sha256sum] = "e22ef3fb038968e823c805649b32b045c986ad1e62ce6fd69cd35a779ef08e0f"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
