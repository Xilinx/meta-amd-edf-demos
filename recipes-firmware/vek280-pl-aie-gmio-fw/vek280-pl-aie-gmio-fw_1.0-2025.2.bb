SUMMARY = "VEK280 Segemented Configuration(DFx Full) firmware using dfx_user_dts bbclass"
DESCRIPTION = "VEK280 Segemented Configuration(DFx Full) PL AIE firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://artifactory.xilinx.com/artifactory/petalinux-hwproj-dev/sdt/2025.2/2025.2_0602_1_06030318/external/vek280-pl-aie-gmio-fw/vek280-pl-aie-gmio-fw_2025.2_0602_1.tar.gz"

SRC_URI[sha256sum] = "4d2def344a6ffbcf0ee23a43203548646b8832f9c4634992704257031e2ca338"

COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"
COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "vek280-pl-aie-gmio-fw"
