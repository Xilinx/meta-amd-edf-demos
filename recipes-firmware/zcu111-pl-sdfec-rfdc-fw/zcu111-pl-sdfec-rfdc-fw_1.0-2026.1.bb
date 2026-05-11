SUMMARY = "ZCU111 full pl firmware using dfx_user_dts bbclass"
DESCRIPTION = "ZCU111 full  PL SDFEC and RFDC firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/05100702/external/fwapp/zcu111-pl-sdfec-rfdc-fw_2026.1_0510_1_05100702.tar.gz"

SRC_URI[sha256sum] = "cdf78db8a7d74b05bc437b6fb25a2ddcb0cb822b35918dcff3fb68e5d8ca352f"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"
COMPATIBLE_MACHINE:zynqmp-zcu111-sdt-full = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "zcu111-pl-sdfec-rfdc-fw"
