SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1106_1_11060111/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_1106_1_11060111.tar.gz"
SRC_URI[sha256sum] = "2d9fdebc9dd42ca739cc5abfb104f3c6f8564d960e7cab8cc51543197e57fe56"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
