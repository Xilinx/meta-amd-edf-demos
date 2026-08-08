SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0808_1_08080727/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0808_1_08080727.tar.gz"
SRC_URI[sha256sum] = "61099506df2908176f383e58cb0b9fbccb6ae1cf718d1f92c84b6267e84735b4"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
