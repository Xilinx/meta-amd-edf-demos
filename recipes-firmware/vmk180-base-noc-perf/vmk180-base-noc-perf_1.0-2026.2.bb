SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1004_1_10040624/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_1004_1_10040624.tar.gz"
SRC_URI[sha256sum] = "a6bf8e5a2c3b36ee7ba196336046766069820508ae9f687d15d45b89a59009ac"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
