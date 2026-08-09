SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0809_1_08090727/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0809_1_08090727.tar.gz"
SRC_URI[sha256sum] = "5a48ead6ad166ba948d4a73e0706627f93dcc08b238519a567f147dafa74138b"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
