SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0721_1_07210642/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0721_1_07210642.tar.gz"
SRC_URI[sha256sum] = "5d82c568b7d2773e8792402cbd0b171f6b2b7ded8c19974862ad0ba3915ae69b"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
