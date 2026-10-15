SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1015_1_10150534/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_1015_1_10150534.tar.gz"
SRC_URI[sha256sum] = "c1dfeee07f269817df8da6869704f7fac9263a17c931301ddd1dc8c984ca8fcd"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
