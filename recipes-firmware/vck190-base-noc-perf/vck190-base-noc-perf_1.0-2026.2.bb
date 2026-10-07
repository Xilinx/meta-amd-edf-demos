SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1007_1_10070233/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_1007_1_10070233.tar.gz"
SRC_URI[sha256sum] = "074a7b96595fd1b27ecd62ee82b518244d0067aff196ba29f983d9e59d8eb912"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
