SUMMARY = "GStreamer demo scripts exercising the AV1/HEVC Video \
Decoder Unit (VDU) on AMD Versal devices."
DESCRIPTION = "Demo scripts to run common usecases involving VDU in \
Versal"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=17e31b2e971eed6471a361c7dc4faa18"

require gstreamer-multimedia-notebooks_0.1.inc


inherit features_check

REQUIRED_MACHINE_FEATURES = "vdu"
PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS:${PN} = "gstreamer1.0-plugins-bad bash python3-pip alsa-utils"

EXTRA_OEMAKE = 'D=${D} bindir=${bindir} datadir=${datadir} docdir=${docdir}/${PN}'

FILES:${PN} += "${docdir}/${PN}"

do_install() {
	oe_runmake -C ${S}/vdu install_vdu_examples

	# The ReadMe desktop entry uses l3afpad, not available in EDF.
	rm -f ${D}${datadir}/applications/VDU_Examples_ReadMe.desktop
}

# These libraries shouldn't get installed in world builds unless something
# explicitly depends upon them.

EXCLUDE_FROM_WORLD = "1"
