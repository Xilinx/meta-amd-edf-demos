SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0912_1_09120607/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0912_1_09120607.tar.gz"
SRC_URI[sha256sum] = "031166eba13bbd672510a8d2cbb60802ae564accb0226480a16b1d2d8e3aacc9"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
