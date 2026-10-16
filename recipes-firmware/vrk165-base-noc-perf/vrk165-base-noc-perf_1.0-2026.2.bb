SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1016_1_10160545/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_1016_1_10160545.tar.gz"
SRC_URI[sha256sum] = "91abc66556abf0bc7c9e41b98ac3ed8ae7e365205d81cc138e6f4971427d6095"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
