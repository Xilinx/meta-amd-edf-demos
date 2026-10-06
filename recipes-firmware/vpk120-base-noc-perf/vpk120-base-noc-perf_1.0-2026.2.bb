SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1006_1_10060656/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_1006_1_10060656.tar.gz"
SRC_URI[sha256sum] = "ab06b09cee999af4d8240326e322799f55dacc50e9e424fd18eec924fc513951"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
