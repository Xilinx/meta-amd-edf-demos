SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1105_1_11042350/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_1105_1_11042350.tar.gz"
SRC_URI[sha256sum] = "4b9708986667df98f1fe6e0ea5925a39e02bb80fc74df5fd56e7856264c0c13f"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
