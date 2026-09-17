SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0917_1_09170543/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0917_1_09170543.tar.gz"
SRC_URI[sha256sum] = "7494994d5bbba3c1256e7629860f50fe8eab9ee05cc50a1c67071b6250bd5afe"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
