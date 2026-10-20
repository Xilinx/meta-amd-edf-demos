SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1020_1_10200613/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_1020_1_10200613.tar.gz"
SRC_URI[sha256sum] = "eb430dc93fe5031827100e0a8f0734322ac6c1513e026d14b92ceb762eef7444"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
