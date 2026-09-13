SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0913_1_09130540/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0913_1_09130540.tar.gz"
SRC_URI[sha256sum] = "e09f9a8bb478f29fe31ede4f87f96f2681f5e33cbb8204310beae50b1eaee2d5"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
