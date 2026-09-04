SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0904_1_09040838/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0904_1_09040838.tar.gz"
SRC_URI[sha256sum] = "299eab478db945cd816e7e97ba4908ce6971c39610191acdcf3940b346af0969"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
