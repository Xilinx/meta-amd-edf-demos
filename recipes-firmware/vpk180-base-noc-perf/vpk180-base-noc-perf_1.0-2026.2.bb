SUMMARY = "VPK180 base NoC performance device-tree overlay"
DESCRIPTION = "VPK180 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vpk180-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_1030_1_10300625/external/versal-vpk180-sdt-seg/versal-vpk180-sdt-seg_overlay_noc_2026.2_1030_1_10300625.tar.gz"
SRC_URI[sha256sum] = "7a00cd0eb88d7efad2be56b86fb93662df3fb91d56e41ba5fafbb82e5359bfa0"

COMPATIBLE_MACHINE:versal-vpk180-sdt-seg = "${MACHINE}"
