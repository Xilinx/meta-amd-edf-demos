SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1026_1_10260626/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_1026_1_10260626.tar.gz"
SRC_URI[sha256sum] = "93d1bfe262971f2e6eae5a77a57d025d7d33a73049a0bfbd3e2e4c8ca1e62896"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
