SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0728_1_07280851/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0728_1_07280851.tar.gz"
SRC_URI[sha256sum] = "fb5fb9ee4e87de8d3496d8b73a307cffe0169fddad4b538b8cdafd2f0832ff71"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
