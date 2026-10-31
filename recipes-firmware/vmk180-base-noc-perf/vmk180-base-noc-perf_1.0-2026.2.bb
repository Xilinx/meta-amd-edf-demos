SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1031_1_10310614/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_1031_1_10310614.tar.gz"
SRC_URI[sha256sum] = "5a7892bdb61480d4326e479c412f533192ead798d107e88fd1c8b2fa1b4d106f"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
