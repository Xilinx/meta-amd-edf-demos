SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1031_1_10310614/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_1031_1_10310614.tar.gz"
SRC_URI[sha256sum] = "3362edb3f2fc58e593bcb9011a71a8e9705637af640702e2311ac98cff529b98"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
