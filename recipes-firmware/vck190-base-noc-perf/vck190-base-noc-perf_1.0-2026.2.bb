SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0724_1_07241050/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0724_1_07241050.tar.gz"
SRC_URI[sha256sum] = "5f048362b3f7181608ac5e181dee9dcedbda33f5df3c46b451d4a5e23ee4e62a"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
