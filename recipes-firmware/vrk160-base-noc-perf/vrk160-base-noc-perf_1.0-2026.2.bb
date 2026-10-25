SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1025_1_10250540/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1025_1_10250540.tar.gz"
SRC_URI[sha256sum] = "44c053b12fd2c3b8ecb1c4e02eeabb73401c9bd49b11c59c835eb9cd005496fe"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
