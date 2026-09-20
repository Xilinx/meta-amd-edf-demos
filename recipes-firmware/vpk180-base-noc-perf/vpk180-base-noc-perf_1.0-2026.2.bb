SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0920_1_09200102/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0920_1_09200102.tar.gz"
SRC_URI[sha256sum] = "246ddc1e2e5a807bfd94e7b79f893eb038b51255d43c3ccf513ba6183a3f9d17"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
