SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0905_1_09050743/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0905_1_09050743.tar.gz"
SRC_URI[sha256sum] = "9265437f42ceda86875ee18a7c731b519297f6b0730a34661a66224e3aec24e1"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
