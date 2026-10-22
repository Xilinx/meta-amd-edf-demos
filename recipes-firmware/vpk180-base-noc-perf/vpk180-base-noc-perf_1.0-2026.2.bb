SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1022_1_10220242/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_1022_1_10220242.tar.gz"
SRC_URI[sha256sum] = "5b3b8bda77376be4a4f395afdb0f7925feb680978dc051d71597919d61e7bdb7"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
