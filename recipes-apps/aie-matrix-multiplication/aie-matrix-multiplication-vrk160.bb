SUMMARY = "AIE matrix multiplication application"
SECTION = "apps"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://aie-matrix-multiplication.cpp \
	   file://Makefile \
		  "
inherit autotools

S = "${WORKDIR}"
B = "${S}"

EXTRA_OEMAKE += "__AIE_ARCH__=10 __BOARD__=160"
CXXFLAGS += "-I${STAGING_DIR_TARGET}/usr/include/xrt"

DEPENDS += "xrt xgemm"

do_configure[noexec] = "1"

do_install() {
	     install -d ${D}${bindir}
	     install -m 0755 aie-matrix-multiplication ${D}${bindir}
}
