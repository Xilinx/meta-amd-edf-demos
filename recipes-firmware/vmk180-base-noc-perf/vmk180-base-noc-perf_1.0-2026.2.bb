SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1028_1_10280834/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_1028_1_10280834.tar.gz"
SRC_URI[sha256sum] = "4b948af6059dfa6ec89844354266282e132eadfb339e08eabf5cfbeac728046d"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
