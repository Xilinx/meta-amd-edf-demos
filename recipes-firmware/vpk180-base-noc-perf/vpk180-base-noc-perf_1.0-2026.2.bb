SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0904_1_09040838/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0904_1_09040838.tar.gz"
SRC_URI[sha256sum] = "268ece0bfbb47de489c71ac6c5ab83c457992683362f9da61a148e10089cfea2"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
