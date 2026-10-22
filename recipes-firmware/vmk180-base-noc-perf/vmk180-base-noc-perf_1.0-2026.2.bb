SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1022_1_10220242/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_1022_1_10220242.tar.gz"
SRC_URI[sha256sum] = "3be89ab250e07620bb7b27e13580f7a154dfad9d6a87196abd4d5379f963c2e3"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
