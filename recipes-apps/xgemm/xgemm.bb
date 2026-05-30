SUMMARY = "xgemm recipe"
SECTION = "apps"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

REPO ??= "git://github.com/Xilinx/plnx-aie-examples.git;protocol=https"

BRANCH ??= "main"
BRANCHARG = "${@['nobranch=1', 'branch=${BRANCH}'][d.getVar('BRANCH', True) != '']}"

SRC_URI = "${REPO};${BRANCHARG}"
SRCREV ??= "f6f3876b0cf070dd528b4c7acfd0a7727f92d8be"

S = "${WORKDIR}/git"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
        install -d ${D}${includedir}
        install -d ${D}${includedir}/aie/
        install -d ${D}${includedir}/aie/kernels/
        install -m 644 ${S}/designs/xgemm-gmio/aie/kernels/config.h ${D}${includedir}/aie/kernels/
}
