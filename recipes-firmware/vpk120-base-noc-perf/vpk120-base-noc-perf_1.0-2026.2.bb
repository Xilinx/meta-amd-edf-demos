SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0729_1_07291202/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0729_1_07291202.tar.gz"
SRC_URI[sha256sum] = "c986740bfa9958e4ab34974028a04b3c23678a7ee25d5dbdbf9565609f747bea"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
