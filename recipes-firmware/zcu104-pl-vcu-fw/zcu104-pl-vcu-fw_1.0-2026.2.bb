SUMMARY = "ZCU104 full pl firmware using dfx_user_dts bbclass"
DESCRIPTION = "ZCU104 full  PL VCU firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.2/edf_files/2026.2/10310614/external/fwapp/zcu104-pl-vcu-fw_2026.2_1031_1_10310614.tar.gz"

SRC_URI[sha256sum] = "69d2e691533d1db7e91fd7834c3c2bed772b748d2cf19033e924e63c0bceca2e"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-mali-common = "${MACHINE}"
COMPATIBLE_MACHINE:zynqmp-zcu104-sdt-full = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "zcu104-pl-vcu-fw"
