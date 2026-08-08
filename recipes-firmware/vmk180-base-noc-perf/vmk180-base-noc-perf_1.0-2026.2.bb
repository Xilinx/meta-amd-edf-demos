SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0808_1_08080727/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0808_1_08080727.tar.gz"
SRC_URI[sha256sum] = "5780b879e012be85e195d6f39ded7585260eafc6a5de56f2d443d82f6769843b"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
