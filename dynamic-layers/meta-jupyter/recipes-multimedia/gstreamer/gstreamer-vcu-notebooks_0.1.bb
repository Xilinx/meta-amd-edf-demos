SUMMARY = "Jupyter notebook examples that drive the GStreamer-VCU \
demos on Zynq UltraScale+ MPSoC EV devices."
DESCRIPTION = "Jupyter notebook examples for VCU in ZynqMP-EV devices"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=17e31b2e971eed6471a361c7dc4faa18"

inherit jupyter-examples

require gstreamer-multimedia-notebooks_0.1.inc


inherit features_check

REQUIRED_MACHINE_FEATURES = "vcu"
PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS:${PN} = "packagegroup-xilinx-jupyter gstreamer-vcu-examples gstreamer1.0-python"

EXTRA_OEMAKE = 'D=${D} JUPYTER_DIR=${JUPYTER_DIR}'

do_install() {
	oe_runmake -C ${S}/vcu install_vcu_notebooks
}
