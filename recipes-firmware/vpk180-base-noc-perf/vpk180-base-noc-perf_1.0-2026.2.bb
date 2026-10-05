SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1005_1_10050713/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_1005_1_10050713.tar.gz"
SRC_URI[sha256sum] = "91f94695ae352db4e1a2193ecb6c3c0d11e013437feaf646a330794d2a529e42"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
