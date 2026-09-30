SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0930_1_09300557/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0930_1_09300557.tar.gz"
SRC_URI[sha256sum] = "43d11cd9b5e1207753ed227daf255370f47d5cc0ff31618a69bac63d0581b014"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
