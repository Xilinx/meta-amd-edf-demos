SUMMARY = "VRK160 Segemented Configuration(DFx Full) firmware using dfx_user_dts bbclass"
DESCRIPTION = "VRK160 Segemented Configuration(DFx Full) PL AIE firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://artifactory.xilinx.com/artifactory/petalinux-hwproj-dev/edf_files/2026.1/12110000/external/fwapp/vrk160-pl-aie-gmio-fw_2026.1_1210_1_12110000.tar.gz"

SRC_URI[sha256sum] = "e8d2bd891540b199f6d7c436466361d5891ff8ad7ef6bbf30c02c7652f040dca"

COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"
COMPATIBLE_MACHINE:versal-vrk160-sdt-seg = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "vrk160-pl-aie-gmio-fw"
