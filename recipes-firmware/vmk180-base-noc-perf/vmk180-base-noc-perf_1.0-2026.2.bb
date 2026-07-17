SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0716_1_07160732/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0716_1_07160732.tar.gz"
SRC_URI[sha256sum] = "d4e98566417e7fe134f0bb9e2222be8e30aabda27f89f40342795f01daab7e83"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
