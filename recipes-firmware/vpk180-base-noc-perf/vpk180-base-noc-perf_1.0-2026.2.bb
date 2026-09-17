SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0917_1_09170543/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0917_1_09170543.tar.gz"
SRC_URI[sha256sum] = "198b4fcc4153dbe178cf981ee8f5c60b1f0ce40ea0fd1d5dbcf6e7aa095652c3"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
