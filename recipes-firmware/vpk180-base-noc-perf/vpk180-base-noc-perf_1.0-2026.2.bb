SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0716_1_07160732/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0716_1_07160732.tar.gz"
SRC_URI[sha256sum] = "6a78315d7cbabb49af72be21e20da1b4b43b32e651571484717b4ef1e50d8c7d"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
