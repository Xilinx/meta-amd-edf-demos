SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0814_1_08140754/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0814_1_08140754.tar.gz"
SRC_URI[sha256sum] = "0d03c945576e70134544e467fcabfb560afd90ad559971a7e2f2eb6c4a290249"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
