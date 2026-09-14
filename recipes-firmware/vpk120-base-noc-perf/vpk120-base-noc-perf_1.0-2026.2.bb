SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0914_1_09140553/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0914_1_09140553.tar.gz"
SRC_URI[sha256sum] = "447fe77e5ca9182b47ee2df32659248c1d20e71fe1bf2b051ab8cbfec6a2400f"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
