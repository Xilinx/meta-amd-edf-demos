SUMMARY = "VCK190 base NoC performance device-tree overlay"
DESCRIPTION = "VCK190 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vck190-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0803_1_08030529/external/versal-vck190-sdt-seg/versal-vck190-sdt-seg_overlay_noc_2026.2_0803_1_08030529.tar.gz"
SRC_URI[sha256sum] = "83fe1fa6616fdfd3201bbf808e001692090a1f8dbdbe8c7e5d6d39861749cc65"

COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"
