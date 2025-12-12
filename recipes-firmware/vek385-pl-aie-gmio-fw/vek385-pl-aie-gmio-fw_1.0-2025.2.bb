SUMMARY = "VEK385 Segemented Configuration(DFx Full) firmware using dfx_user_dts bbclass"
DESCRIPTION = "VEK385 Segemented Configuration(DFx Full) PL AIE firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://xcoartifactory.xilinx.com/artifactory/petalinux-hwproj-dev/edf_files/2026.1/12090000/external/fwapp/vek385-pl-aie-gmio-fw_2026.1_1208_2_12090000.tar.gz"

SRC_URI[sha256sum] = "4298e08c0ce6300be270db1b8e19ee498c8dcee72e3b411d50ca49d599f2c3a3"

COMPATIBLE_MACHINE:amd-cortexa78-mali-common = "${MACHINE}"
COMPATIBLE_MACHINE:versal-2ve-2vm-vek385-sdt-seg = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "vek385-pl-aie-gmio-fw"
