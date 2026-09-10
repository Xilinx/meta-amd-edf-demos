SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0910_1_09100633/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0910_1_09100633.tar.gz"
SRC_URI[sha256sum] = "bc941618e2675c9fc712234d97f97e462d19322728b4e0b7ce40761069685a57"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
