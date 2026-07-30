SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0730_1_07300857/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0730_1_07300857.tar.gz"
SRC_URI[sha256sum] = "a7ab51f929485d315e944d710a092b388ef81bb3cc85c054aa098dc1f6a22da2"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
