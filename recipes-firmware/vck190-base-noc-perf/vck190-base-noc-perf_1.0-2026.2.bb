SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1001_1_10010725/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_1001_1_10010725.tar.gz"
SRC_URI[sha256sum] = "fb957902acc2a3875526043da6644265d35cf5325582b172742836928050b898"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
