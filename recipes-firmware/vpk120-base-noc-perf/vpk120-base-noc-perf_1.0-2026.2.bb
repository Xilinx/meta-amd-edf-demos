SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0725_1_07251404/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0725_1_07251404.tar.gz"
SRC_URI[sha256sum] = "1535d6195b115daccc38744a7b945f37cd0d649eca6af73976570bc0fa911776"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
