SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0914_1_09140553/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0914_1_09140553.tar.gz"
SRC_URI[sha256sum] = "e08ddb2e0cbd8c38e751b46ab2fc2234dd06c68fdcc9458f7ef08b45e32e1b02"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
