SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0815_1_08150632/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0815_1_08150632.tar.gz"
SRC_URI[sha256sum] = "b36d75c7261e7567e784dbdea747ba382ea4de15870e583c07fbb1ac93052d7f"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
