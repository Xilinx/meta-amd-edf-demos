SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0814_1_08140754/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0814_1_08140754.tar.gz"
SRC_URI[sha256sum] = "206f15d1a3c94b2e5eb4fd771428f8fc45d6bf57e344dcf1ad7708027b523ab8"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
