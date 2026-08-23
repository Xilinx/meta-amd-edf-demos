SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0823_1_08230755/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0823_1_08230755.tar.gz"
SRC_URI[sha256sum] = "d287742d82f1be4b14385e3ea214b2d50d6769efeeff6646ac4ee80580b4ced5"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
