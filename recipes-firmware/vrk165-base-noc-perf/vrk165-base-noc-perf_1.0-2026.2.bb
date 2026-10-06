SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1006_1_10060656/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_1006_1_10060656.tar.gz"
SRC_URI[sha256sum] = "c85947adc5a0b322cb476405148235f55b2a4e77d27d5ea3159109abf87239b2"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
