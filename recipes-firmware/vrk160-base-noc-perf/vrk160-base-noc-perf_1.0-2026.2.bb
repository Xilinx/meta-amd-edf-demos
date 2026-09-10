SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0910_1_09100633/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0910_1_09100633.tar.gz"
SRC_URI[sha256sum] = "39dc8c29497829c54ecb40552e522dbd1f7bf686742e8c30d9d4750d21ead5ec"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
