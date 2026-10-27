SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1027_1_10270632/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_1027_1_10270632.tar.gz"
SRC_URI[sha256sum] = "fea6483922cdac7ec9158c7c5f0fb4ff6a1f0d48f5051e68cf59f31f9a49a19f"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
