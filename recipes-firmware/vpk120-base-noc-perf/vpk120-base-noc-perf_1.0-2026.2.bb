SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0723_1_07231200/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0723_1_07231200.tar.gz"
SRC_URI[sha256sum] = "f9774f50723799e5018f53ffc39577f8efb3852d001ffd9564bb5bbd3c5b49f5"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
