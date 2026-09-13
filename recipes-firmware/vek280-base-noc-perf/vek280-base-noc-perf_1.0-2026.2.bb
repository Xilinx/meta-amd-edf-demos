SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0913_1_09130540/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0913_1_09130540.tar.gz"
SRC_URI[sha256sum] = "457ee47c7c203fe95eca2d7330f33cbe337cfb2560023d4989c68acb071794b1"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
