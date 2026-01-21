SUMMARY = "ZCU106 full pl firmware using dfx_user_dts bbclass"
DESCRIPTION = "ZCU106 full  PL VCU firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://artifactory.xilinx.com/artifactory/petalinux-hwproj-dev/edf_files/2026.1/01190000/external/fwapp/zcu106-pl-vcu-fw_2026.1_0118_1_01190000.tar.gz"

SRC_URI[sha256sum] = "983e747d030104c86cfbe582573216d05f48182913c3029716f493013186f5cb"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-mali-common = "${MACHINE}"
COMPATIBLE_MACHINE:zynqmp-zcu106-sdt-full = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "zcu106-pl-vcu-fw"
