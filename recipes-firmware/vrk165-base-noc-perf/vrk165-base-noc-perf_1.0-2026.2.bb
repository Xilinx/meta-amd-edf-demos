SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0814_1_08140754/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0814_1_08140754.tar.gz"
SRC_URI[sha256sum] = "11ae358dd052d35f2fce6a5180b5b569c55d02606126849d1373ead0cf2f446e"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
