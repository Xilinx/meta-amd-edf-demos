SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0929_1_09291029/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0929_1_09291029.tar.gz"
SRC_URI[sha256sum] = "5134170aa00d260ad5184320e9637158ea30d8478156ca35eb61ff5d68941de1"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
