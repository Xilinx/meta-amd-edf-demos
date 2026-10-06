SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1006_1_10060656/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_1006_1_10060656.tar.gz"
SRC_URI[sha256sum] = "f5388a2aee0364d39cd5e0053706b65576fe4bba1cd0b29430ee49cec38a08ca"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
