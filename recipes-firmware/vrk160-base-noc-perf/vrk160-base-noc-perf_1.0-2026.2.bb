SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1007_1_10070233/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1007_1_10070233.tar.gz"
SRC_URI[sha256sum] = "5b3935d436a350770031ec3cd52712621587ff80cae63c89d249a81792c9486d"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
