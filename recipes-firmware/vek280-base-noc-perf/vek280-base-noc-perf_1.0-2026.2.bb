SUMMARY = "VEK280 base NoC performance device-tree overlay"
DESCRIPTION = "VEK280 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vek280-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0815_1_08150632/external/versal-vek280-sdt-seg/versal-vek280-sdt-seg_overlay_noc_2026.2_0815_1_08150632.tar.gz"
SRC_URI[sha256sum] = "605fb10353f75aaa2b07a041b07183bcc2d78bc6a507b48e9888cc63de1a5d6e"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"
