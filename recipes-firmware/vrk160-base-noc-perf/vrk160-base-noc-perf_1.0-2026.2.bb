SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1027_1_10270632/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1027_1_10270632.tar.gz"
SRC_URI[sha256sum] = "0df8b4ebc535ba3ca6868dfa102295aab7c5dcc8080abc7e102dd49ce3837373"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
