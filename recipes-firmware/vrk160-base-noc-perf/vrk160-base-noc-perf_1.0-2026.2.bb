SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0908_1_09080452/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0908_1_09080452.tar.gz"
SRC_URI[sha256sum] = "053703c76b20a84c6fe4e3502c04860bfda46a60ee1c0cd4171f911efedc9d88"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
