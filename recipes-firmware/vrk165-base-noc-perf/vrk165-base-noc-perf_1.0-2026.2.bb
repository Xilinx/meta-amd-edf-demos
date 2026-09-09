SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0909_1_09090623/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0909_1_09090623.tar.gz"
SRC_URI[sha256sum] = "f16ae1f36a947ab4269eb246101bd7e21795a260148a0dc0c775c54076789057"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
