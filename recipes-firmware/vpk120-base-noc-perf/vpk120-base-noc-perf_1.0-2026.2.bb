SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1028_1_10280834/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_1028_1_10280834.tar.gz"
SRC_URI[sha256sum] = "5f677c7756e8e0f46bc38098d457b3cc59cbafdf5b6f77999b60f2f53e1cbac2"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
