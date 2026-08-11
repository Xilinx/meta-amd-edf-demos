SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0810_1_08101825/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_0810_1_08101825.tar.gz"
SRC_URI[sha256sum] = "e0c11a3271550d7da47c7bf171367b52d443555058e50bc9be2b52cf910d79b7"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
