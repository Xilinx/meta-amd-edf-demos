SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0823_1_08230755/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0823_1_08230755.tar.gz"
SRC_URI[sha256sum] = "1ccd07cce9c70478ab1e624e3afbc8ba4f3bbf5ac68bb76adb7be0967f9423f1"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
