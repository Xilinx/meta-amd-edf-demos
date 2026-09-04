SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0904_1_09040838/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0904_1_09040838.tar.gz"
SRC_URI[sha256sum] = "1303f4a6b41aeb46d47b01a77a14b3e0c8465288451d270436b8add3f87c8e56"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
