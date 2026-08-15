SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0815_1_08150632/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0815_1_08150632.tar.gz"
SRC_URI[sha256sum] = "5ef889a3ff34d9dd81131d6efd11f8aa52f9e3c3115f27e4efbe5f780a058c4a"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
