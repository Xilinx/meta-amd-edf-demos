SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1024_1_10240546/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_1024_1_10240546.tar.gz"
SRC_URI[sha256sum] = "96c0a802ba50123e97ceb3c07ae911427d635197983eb5c02432b3b086542b76"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
