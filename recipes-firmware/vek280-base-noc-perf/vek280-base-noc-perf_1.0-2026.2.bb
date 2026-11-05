SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1105_1_11042350/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_1105_1_11042350.tar.gz"
SRC_URI[sha256sum] = "ffd97f20c2e501bbe7286e1e3f9ce508a8a46206ca78d994b00a5c073f3132a1"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
