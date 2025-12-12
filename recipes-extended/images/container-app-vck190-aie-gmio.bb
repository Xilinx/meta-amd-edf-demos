require recipes-extended/images/container-app-base.bb

CONTAINER_APP = " \
	packagegroup-core-base-utils \
	dfx-mgr-client \
        aie-matrix-multiplication-vck190 \
	vck190-pl-aie-gmio-fw \
        "

CONTAINER_APP_CMD = ""

COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"

CONTAINER_SHELL = "bash"
