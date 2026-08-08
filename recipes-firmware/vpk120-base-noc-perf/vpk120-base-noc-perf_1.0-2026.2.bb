SUMMARY = "VPK120 base NoC performance device-tree overlay"
DESCRIPTION = "VPK120 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk120-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0808_1_08080727/external/versal-vpk120-sdt-seg/versal-vpk120-sdt-seg_overlay_noc_2026.2_0808_1_08080727.tar.gz"
SRC_URI[sha256sum] = "574bad2a633810ff2647b5b3267d6953e08379be64b32f9da7b82fe613058ed0"

COMPATIBLE_MACHINE:versal-vpk120-sdt-seg = "${MACHINE}"
