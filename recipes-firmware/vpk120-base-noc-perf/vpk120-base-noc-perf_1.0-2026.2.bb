SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1025_1_10250540/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_1025_1_10250540.tar.gz"
SRC_URI[sha256sum] = "0e1d4aed856c44b758fb4b00fcb272016788d6754526d692da954617e26a5dd7"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
