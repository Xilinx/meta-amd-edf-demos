require recipes-extended/images/container-app-base.bb

CONTAINER_APP = " \
	packagegroup-core-base-utils \
	dfx-mgr-client \
	zcu104-pl-vcu-fw \
       "

CONTAINER_APP_CMD = ""

COMPATIBLE_MACHINE:amd-cortexa53-mali-common = "${MACHINE}"

CONTAINER_SHELL = "bash"
