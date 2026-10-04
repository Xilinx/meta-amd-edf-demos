SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1004_1_10040624/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_1004_1_10040624.tar.gz"
SRC_URI[sha256sum] = "80dcf5613cdc25352099d6f7dd1d8f1afd01333c0d98e74c0e8d689a67b31130"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
