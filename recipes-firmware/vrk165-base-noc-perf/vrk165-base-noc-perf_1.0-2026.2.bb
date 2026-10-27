SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1027_1_10270632/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_1027_1_10270632.tar.gz"
SRC_URI[sha256sum] = "a8aea4ffd722bd991f6d50497d6feee436b5143cd25fb49a55b9ad3eefebd6b0"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
