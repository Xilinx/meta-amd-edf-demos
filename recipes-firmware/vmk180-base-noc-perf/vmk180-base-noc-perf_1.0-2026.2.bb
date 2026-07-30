SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0730_1_07300857/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0730_1_07300857.tar.gz"
SRC_URI[sha256sum] = "2e6f833015caf903c7e23aa2a044895e453eea4d0ccef88dc7fd25d9b81b15d5"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
