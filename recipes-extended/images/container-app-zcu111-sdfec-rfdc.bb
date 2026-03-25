require recipes-extended/images/container-app-base.bb

CONTAINER_APP = " \
	packagegroup-core-base-utils \
	dfx-mgr-client \
	zcu111-pl-sdfec-rfdc-fw \
	rfdc-selftest \
	rfdc-intr \
	rfdc-read-write \
	sdfec \
"

CONTAINER_APP_CMD = ""

COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"

CONTAINER_SHELL = "bash"
