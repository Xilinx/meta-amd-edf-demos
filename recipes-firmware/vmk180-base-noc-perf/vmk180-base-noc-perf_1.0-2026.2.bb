SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0913_1_09130540/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0913_1_09130540.tar.gz"
SRC_URI[sha256sum] = "0d523c300e6d4329780f235240defe39bb02e2c166572001a4b2c97065d34ae3"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
