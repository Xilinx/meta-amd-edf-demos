SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0903_1_09030751/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0903_1_09030751.tar.gz"
SRC_URI[sha256sum] = "e143b20f79c9d9d7264685e46d5b91ea8c784fadb6602ccfde02bba6ddd4096e"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
