SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0929_1_09291029/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0929_1_09291029.tar.gz"
SRC_URI[sha256sum] = "511a43ab2e09656a66f571555f307b463867fc62b82f6fa489a577400978dd02"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
