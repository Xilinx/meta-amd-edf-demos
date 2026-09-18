SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0918_1_09180636/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0918_1_09180636.tar.gz"
SRC_URI[sha256sum] = "95bd3486ccc052ac4baac6288b0adb0e6ecc66a703b4105059f631ea2065f750"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
