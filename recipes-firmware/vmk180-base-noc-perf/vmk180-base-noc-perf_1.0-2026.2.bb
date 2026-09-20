SUMMARY = "VMK180 base NoC performance device-tree overlay"
DESCRIPTION = "VMK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vmk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0920_1_09200102/external/versal-vmk180-sdt-seg/versal-vmk180-sdt-seg_overlay_noc_2026.2_0920_1_09200102.tar.gz"
SRC_URI[sha256sum] = "80dbda784584abb25e5614cf756af72b4e0ababd90696996d4478794a69d8a15"

COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"
