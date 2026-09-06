SUMMARY = "VRK160 base NoC performance device-tree overlay"
DESCRIPTION = "VRK160 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk160-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0906_1_09060734/external/versal-vrk160-sdt-seg/versal-vrk160-sdt-seg_overlay_noc_2026.2_0906_1_09060734.tar.gz"
SRC_URI[sha256sum] = "c47293067a111a00710a797beb6bd956a623ffd14c1cd9ea3fe041ed088cf02c"

COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"
