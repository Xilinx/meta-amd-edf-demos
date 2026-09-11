SUMMARY = "GStreamer demo scripts exercising the H.264/H.265 Video \
Codec Unit (VCU) on Zynq UltraScale+ MPSoC EV devices."
DESCRIPTION = "Demo scripts to run common usecases involving VCU in \
ZynqMP"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=17e31b2e971eed6471a361c7dc4faa18"

require gstreamer-multimedia-notebooks_0.1.inc


inherit features_check

REQUIRED_MACHINE_FEATURES = "vcu"
PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS:${PN} = " \
    gstreamer1.0 \
    ${@bb.utils.contains_any('LICENSE_FLAGS_ACCEPTED', \
        'commercial commercial_gstreamer1.0-omx', 'gstreamer1.0-omx', '', d)} \
    gstreamer1.0-plugins-base-audioconvert \
    gstreamer1.0-plugins-base-audioresample \
    gstreamer1.0-plugins-base-videoconvertscale \
    gstreamer1.0-plugins-base-videotestsrc \
    gstreamer1.0-plugins-base-vorbis \
    gstreamer1.0-plugins-base-playback \
    gstreamer1.0-plugins-base-typefindfunctions \
    gstreamer1.0-plugins-base-gio \
    gstreamer1.0-plugins-good-autodetect \
    gstreamer1.0-plugins-good-video4linux2 \
    gstreamer1.0-plugins-good-rtp \
    gstreamer1.0-plugins-good-rtpmanager \
    gstreamer1.0-plugins-good-udp \
    gstreamer1.0-plugins-good-isomp4 \
    gstreamer1.0-plugins-good-matroska \
    gstreamer1.0-plugins-good-soup \
    gstreamer1.0-plugins-good-multifile \
    gstreamer1.0-plugins-good-audioparsers \
    gstreamer1.0-plugins-bad-videoparsersbad \
    gstreamer1.0-plugins-bad-mpegtsdemux \
    gstreamer1.0-plugins-bad-mpegtsmux \
    gstreamer1.0-plugins-bad-kms \
    ${@bb.utils.contains_any('LICENSE_FLAGS_ACCEPTED', \
        'commercial commercial_faad2', 'gstreamer1.0-plugins-bad-faad', '', d)} \
    ${@bb.utils.contains_any('LICENSE_FLAGS_ACCEPTED', \
        'commercial commercial_faac', 'gstreamer1.0-plugins-bad-faac', '', d)} \
    gstreamer1.0-plugins-bad-debugutilsbad \
    ${@bb.utils.contains('DISTRO_FEATURES', 'alsa', \
        'gstreamer1.0-plugins-base-alsa alsa-utils', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'pulseaudio', \
        'gstreamer1.0-plugins-good-pulseaudio pulseaudio-server', '', d)} \
    bash \
    python3-pip \
    util-linux-getopt \
    libdrm-tests \
    devmem2 \
    procps \
    psmisc \
    wget \
    which \
    v4l-utils \
"

EXTRA_OEMAKE = 'D=${D} bindir=${bindir} datadir=${datadir} docdir=${docdir}/${PN}'

FILES:${PN} += "${docdir}/${PN}"

do_install() {
        oe_runmake -C ${S}/vcu install_vcu_examples

        # The AVC and HEVC decode entries launch matchbox-terminal, which is
        # no longer shipped. The ReadMe desktop entry uses l3afpad, not in EDF.
        rm -f ${D}${datadir}/applications/4K_AVC_Decode.desktop
        rm -f ${D}${datadir}/applications/4K_HEVC_Decode.desktop
        rm -f ${D}${datadir}/applications/VCU_Examples_ReadMe.desktop
}

# These libraries shouldn't get installed in world builds unless something
# explicitly depends upon them.

EXCLUDE_FROM_WORLD = "1"
