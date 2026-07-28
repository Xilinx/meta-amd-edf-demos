SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0728_1_07280851/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0728_1_07280851.tar.gz"
SRC_URI[sha256sum] = "1df8920befcc2ccf3ab667328f00a7cf81345ece2664c3d92945652b6f06bde8"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
