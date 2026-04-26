SUMMARY = "VEK385 Segemented Configuration(DFx Full) firmware using dfx_user_dts bbclass"
DESCRIPTION = "VEK385 Segemented Configuration(DFx Full) PL AIE firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/04260607/external/fwapp/vek385-pl-aie-gmio-fw_2026.1_0426_1_04260607.tar.gz"

SRC_URI[sha256sum] = "221c9605affd56abac94bb037b6efa56765d8a3eb92d79e6db918f23dfd28040"

COMPATIBLE_MACHINE:amd-cortexa78-mali-common = "${MACHINE}"
COMPATIBLE_MACHINE:versal-2ve-2vm-vek385-sdt-seg = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "vek385-pl-aie-gmio-fw"
