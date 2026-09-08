SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0908_1_09080452/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0908_1_09080452.tar.gz"
SRC_URI[sha256sum] = "a99bba210d18af107caacda6f19cf70f5729579361175e8dc630b032f20e083a"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
