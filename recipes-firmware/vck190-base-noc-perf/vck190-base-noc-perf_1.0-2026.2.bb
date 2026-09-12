SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0912_1_09120607/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0912_1_09120607.tar.gz"
SRC_URI[sha256sum] = "95c2ae9f776953ee39ee045f367492b357f83af1efaa711fbf99e28b2a073ba7"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
