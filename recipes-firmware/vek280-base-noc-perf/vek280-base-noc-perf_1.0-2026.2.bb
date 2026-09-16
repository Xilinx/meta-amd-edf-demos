SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0916_1_09160614/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0916_1_09160614.tar.gz"
SRC_URI[sha256sum] = "91fbd100f22f6b34cf6b882fce96a48aa4c497893f5f55d1e4807189f40c2b51"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
