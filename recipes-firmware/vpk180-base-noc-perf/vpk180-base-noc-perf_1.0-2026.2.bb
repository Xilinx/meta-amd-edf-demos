SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0913_1_09130540/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0913_1_09130540.tar.gz"
SRC_URI[sha256sum] = "2800d423b312d35a8fa3160820bb78f5936415edef51338326d59126040d22a2"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
