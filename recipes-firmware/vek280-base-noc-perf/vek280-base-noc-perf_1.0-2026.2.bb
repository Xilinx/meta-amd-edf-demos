SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0803_1_08030529/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0803_1_08030529.tar.gz"
SRC_URI[sha256sum] = "53f6c8763d6e5c24942babb4e2d272c6d1096429108819343e679b2b0a6ae2b5"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
