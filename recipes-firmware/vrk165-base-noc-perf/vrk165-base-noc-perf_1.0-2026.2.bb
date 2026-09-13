SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0913_1_09130540/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0913_1_09130540.tar.gz"
SRC_URI[sha256sum] = "9d53127384b10e6963021843cf705d3b506a3f8a1599a4994fd90c3e03ccc93f"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
