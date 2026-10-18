SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1018_1_10180550/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_1018_1_10180550.tar.gz"
SRC_URI[sha256sum] = "3ec234ff7dbcdf73e1cd65a59c5d57f890467d433528aee0784262119f18adee"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
