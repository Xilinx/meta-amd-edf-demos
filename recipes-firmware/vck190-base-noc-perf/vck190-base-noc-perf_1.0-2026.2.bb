SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0730_1_07300857/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0730_1_07300857.tar.gz"
SRC_URI[sha256sum] = "a8e71046379739b87dc89de0f1869b0d6469b05bb9c7e2aae95e40ed699d07d9"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
