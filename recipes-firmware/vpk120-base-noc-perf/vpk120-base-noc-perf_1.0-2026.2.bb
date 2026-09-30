SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0930_1_09300557/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0930_1_09300557.tar.gz"
SRC_URI[sha256sum] = "4c44d810ef1ab668feae906b10300b5434f280019d8eb35de8ed98f9089973da"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
