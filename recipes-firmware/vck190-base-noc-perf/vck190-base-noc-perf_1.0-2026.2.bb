SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0928_1_09280533/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0928_1_09280533.tar.gz"
SRC_URI[sha256sum] = "a4e64998ad799d87e7370928fe92990d95f45873d7bf4a59ecbc35ea3d92a003"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
