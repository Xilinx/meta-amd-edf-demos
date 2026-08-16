SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0816_1_08160737/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0816_1_08160737.tar.gz"
SRC_URI[sha256sum] = "2486b1a5b1a1fca6931bfb6127397b170c636500ef5d4190af4cad7a37017594"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
