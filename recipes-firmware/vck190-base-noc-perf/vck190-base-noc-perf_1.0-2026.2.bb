SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0916_1_09160614/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0916_1_09160614.tar.gz"
SRC_URI[sha256sum] = "cdb8f6f4e6793d563b3390706554683c263edc84410fd5f5d81e318293693fdb"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
