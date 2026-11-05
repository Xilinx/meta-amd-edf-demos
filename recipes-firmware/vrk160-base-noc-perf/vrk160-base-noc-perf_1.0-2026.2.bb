SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1105_1_11042350/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1105_1_11042350.tar.gz"
SRC_URI[sha256sum] = "37c16b497961f2bcea8894e0972635b4de0526e0e6702fd6d24be24e21bae850"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
