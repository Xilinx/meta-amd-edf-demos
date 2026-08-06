SUMMARY = "ZCU106 full pl firmware using dfx_user_dts bbclass"
DESCRIPTION = "ZCU106 full  PL VCU firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/08060629/external/fwapp/zcu106-pl-vcu-fw_2026.2_0806_1_08060629.tar.gz"

SRC_URI[sha256sum] = "c49a1f4221f448179f1734045ad3a5a83515530b505b32f2e7833430a7329b3e"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-mali-common = "${MACHINE}"
COMPATIBLE_MACHINE:zynqmp-zcu106-sdt-full = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "zcu106-pl-vcu-fw"
