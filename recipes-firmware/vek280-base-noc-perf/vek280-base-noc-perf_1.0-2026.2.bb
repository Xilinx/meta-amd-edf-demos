SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://xcoartifactory.xilinx.com/artifactory/petalinux-hwproj-dev-local/sdt/2026.2/2026.2_0717_1_07172026/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc.tar.gz"
SRC_URI[sha256sum] = "dfbf1aaa49a6846dfcaa6074ea8d748a8fd27db2204860b537ff4917d61b2493"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
