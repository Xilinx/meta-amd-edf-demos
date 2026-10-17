SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1017_1_10170604/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_1017_1_10170604.tar.gz"
SRC_URI[sha256sum] = "6d0e56f522d1edb5e0959d0e7086179fdc8ef3b14dca676f60e56229467f2bdb"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
