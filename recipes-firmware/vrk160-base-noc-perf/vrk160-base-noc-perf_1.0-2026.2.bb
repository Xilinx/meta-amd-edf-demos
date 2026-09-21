SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0921_1_09210704/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0921_1_09210704.tar.gz"
SRC_URI[sha256sum] = "b3d1009dd6c96747c1e0c77d875006734ed461b192456dac65aff7d2891cd23f"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
