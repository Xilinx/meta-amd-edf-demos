SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0810_1_08101825/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0810_1_08101825.tar.gz"
SRC_URI[sha256sum] = "59201bfa689752f1c469fe0fc74d8423bf680248f6d30c7403cc7bae26ea85ac"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
