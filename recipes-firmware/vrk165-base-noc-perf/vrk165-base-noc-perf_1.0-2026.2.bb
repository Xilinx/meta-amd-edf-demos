SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1013_1_10130555/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_1013_1_10130555.tar.gz"
SRC_URI[sha256sum] = "364f36a5f43cdaa855f43a791caa1f7e37b22cd5dcaa28adfea045011d2c80ba"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
