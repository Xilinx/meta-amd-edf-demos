SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0724_1_07241050/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0724_1_07241050.tar.gz"
SRC_URI[sha256sum] = "38e2a067ab963c3231d8cd1996099de5fe1571c7cf49619b3c911cef690df4fd"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
