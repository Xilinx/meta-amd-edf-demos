SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0928_1_09280533/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0928_1_09280533.tar.gz"
SRC_URI[sha256sum] = "35bb70bc5ed9131e8af1bc2bbe884c0ec031a34d2afe68566b11ce8cc5c9776f"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
