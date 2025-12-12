SUMMARY = "VCK190 Segemented Configuration(DFx Full) firmware using dfx_user_dts bbclass"
DESCRIPTION = "VCK190 Segemented Configuration(DFx Full) PL AIE firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://artifactory.xilinx.com/artifactory/petalinux-hwproj-dev/edf_files/2026.1/12042024/external/fwapp/vck190-pl-aie-gmio-fw_2026.1_1204_1_12042024.tar.gz"

SRC_URI[sha256sum] = "d81b0d72fe917c86db924e67b546547a81000a14d1177c938b4f98ca87861cc7"

COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"
COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "vck190-pl-aie-gmio-fw"
