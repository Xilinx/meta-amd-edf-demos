SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1105_1_11042350/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_1105_1_11042350.tar.gz"
SRC_URI[sha256sum] = "7c4cacb2e9501242c829905edbae90120ea83054ce417e169337d5033fbd731f"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
