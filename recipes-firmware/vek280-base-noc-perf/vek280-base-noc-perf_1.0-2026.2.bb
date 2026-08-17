SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0817_1_08170744/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0817_1_08170744.tar.gz"
SRC_URI[sha256sum] = "4fcfa9b3b4a98fc413a71fc5add0a0cb97e4d12a38c7d4263594f7c06914c635"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
