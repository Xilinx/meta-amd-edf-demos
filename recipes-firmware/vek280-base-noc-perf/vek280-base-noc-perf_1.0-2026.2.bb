SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0915_1_09150548/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0915_1_09150548.tar.gz"
SRC_URI[sha256sum] = "00536dc4c63abdeaa4a0ce23af8bbe4d0cf1e34d9f782b4b84eacce920bec2b1"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
