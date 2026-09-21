SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0921_1_09210704/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0921_1_09210704.tar.gz"
SRC_URI[sha256sum] = "99789d10e16b8ca0b54b4a7010c3450402b09fe706dc0da479712255600884ed"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
