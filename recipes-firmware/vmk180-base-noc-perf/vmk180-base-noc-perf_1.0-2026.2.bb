SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0929_1_09290125/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0929_1_09290125.tar.gz"
SRC_URI[sha256sum] = "2abfe2710ca81cc97c3fbedbcaacaa37292d1c39423cae8ba882222394125dfb"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
