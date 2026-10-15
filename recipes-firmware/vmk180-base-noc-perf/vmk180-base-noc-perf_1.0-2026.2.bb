SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1015_1_10150534/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_1015_1_10150534.tar.gz"
SRC_URI[sha256sum] = "371208dd85b2070c49e85b48937685555214e90746655916ae305f31ff8eecd5"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
