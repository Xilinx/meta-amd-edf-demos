SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0721_1_07210642/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0721_1_07210642.tar.gz"
SRC_URI[sha256sum] = "ed1ad07647dd32708f2fcba2f5db1870b7db6eab03091d2a6338bdf38057941c"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
