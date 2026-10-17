SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1017_1_10170604/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1017_1_10170604.tar.gz"
SRC_URI[sha256sum] = "822416df57523b8b327b48fb938561a1def0fd608c34058c06b23d1129da7b31"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
