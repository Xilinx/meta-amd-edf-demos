SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1002_1_10030743/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_1002_1_10030743.tar.gz"
SRC_URI[sha256sum] = "0a6acc385adfd2fb3331adb215fd68d6aee7a9c2f305f1bd228f9cf055e20c63"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
