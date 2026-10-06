SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1006_1_10060656/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_1006_1_10060656.tar.gz"
SRC_URI[sha256sum] = "4cd3a0d6787c5f07c99bbf664110aa9c0b87ca9ba352b7045282f6b1a23add71"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
