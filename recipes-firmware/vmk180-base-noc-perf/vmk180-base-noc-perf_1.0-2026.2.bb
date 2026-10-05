SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1005_1_10050713/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_1005_1_10050713.tar.gz"
SRC_URI[sha256sum] = "2046d802f0630125c8c85a8a8d506400b5180eb924cd873cc341161226211632"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
