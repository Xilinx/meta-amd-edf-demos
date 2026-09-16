SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0916_1_09160614/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0916_1_09160614.tar.gz"
SRC_URI[sha256sum] = "ee0125e3583b58386a7577cd2ce21327362ca3167e843f147ba6e3599f066ba5"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
