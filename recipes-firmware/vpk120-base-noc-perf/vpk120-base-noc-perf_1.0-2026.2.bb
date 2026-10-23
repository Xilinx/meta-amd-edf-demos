SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1023_1_10230747/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_1023_1_10230747.tar.gz"
SRC_URI[sha256sum] = "9fc16c562d0a81cdc9381663bbfea9650537ca0b0fdc1c4845eec339b80b8165"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
