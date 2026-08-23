SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0823_1_08230755/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0823_1_08230755.tar.gz"
SRC_URI[sha256sum] = "7af4c529e41dbb5b213a89b17d0185152474fec4ad8bdc1d80324f189847533a"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
