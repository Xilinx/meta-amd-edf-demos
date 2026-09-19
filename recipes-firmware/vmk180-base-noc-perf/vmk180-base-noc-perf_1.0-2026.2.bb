SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0919_1_09190402/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0919_1_09190402.tar.gz"
SRC_URI[sha256sum] = "a834a00f19b0e389d7b3fba7b4015fec0adb24bc59b5dcd03f8ca6b406cece7e"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
