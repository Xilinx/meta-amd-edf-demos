SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0724_1_07241050/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0724_1_07241050.tar.gz"
SRC_URI[sha256sum] = "62517868378fdda3d908a3d8f051b4860ac373edd6ca7945e1c88ecacb2cc424"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
