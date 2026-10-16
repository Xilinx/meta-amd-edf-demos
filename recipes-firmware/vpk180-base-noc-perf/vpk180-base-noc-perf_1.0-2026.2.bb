SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1016_1_10160545/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_1016_1_10160545.tar.gz"
SRC_URI[sha256sum] = "2e943d437ef34eeedda372f9dc51f14300b0bd973a748b8f7e430db61e528567"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
