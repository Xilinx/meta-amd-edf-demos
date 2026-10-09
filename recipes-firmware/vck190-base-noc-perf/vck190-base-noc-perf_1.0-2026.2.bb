SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1009_1_10090707/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_1009_1_10090707.tar.gz"
SRC_URI[sha256sum] = "cd7fa6f55212ace7ecbb38d76dfa0836715e830424dad1cf748d727ea3d0375b"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
