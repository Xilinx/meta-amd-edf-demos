SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1008_1_10080546/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_1008_1_10080546.tar.gz"
SRC_URI[sha256sum] = "f709043779bf3bc1d12fe0262a9f4265706aaa0d2ab179dac436f16d602c019a"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
