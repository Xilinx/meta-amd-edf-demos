SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0929_1_09291029/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0924_1_09291029.tar.gz"
SRC_URI[sha256sum] = "fd4d723734b0eda646d685aeecfa6275d77b9fc13cf738db6b43625e629593bc"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
