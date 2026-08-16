SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0816_1_08160737/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0816_1_08160737.tar.gz"
SRC_URI[sha256sum] = "0a4716ac35ae468cb858eb681c32e9e3d6b6d632f4698562ff209b927bd21e85"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
