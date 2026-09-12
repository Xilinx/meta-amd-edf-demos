SUMMARY = "VRK165 base NoC performance device-tree overlay"
DESCRIPTION = "VRK165 base NoC performance monitoring device-tree overlay"

require recipes-firmware/base-noc-perf.inc

NOC_OVERLAY_DIR = "versal-vrk165-sdt-seg_overlay_noc"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/sdt/2026.2/2026.2_0912_1_09120607/external/versal-vrk165-sdt-seg/versal-vrk165-sdt-seg_overlay_noc_2026.2_0912_1_09120607.tar.gz"
SRC_URI[sha256sum] = "9f1e5391375fd74e87bc6710e763a855115bea218a72bed66227bc01bf836b1f"

COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"
