SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1031_1_10310614/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1031_1_10310614.tar.gz"
SRC_URI[sha256sum] = "721644dc9cb3cd2e3fad9ca3f2245dd5c31bd57eafc56b22872885cfa5ba7623"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
