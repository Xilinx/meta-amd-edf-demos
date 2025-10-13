require recipes-extended/images/container-app-base.bb

CONTAINER_APP = " \
	packagegroup-core-base-utils \
	dfx-mgr-client \
	zcu104-pl-vcu-fw \
	vcu-ctrlsw \
	vcu-firmware \
	kernel-module-vcu \
	libvcu-omxil \
"

CONTAINER_APP_CMD = ""

COMPATIBLE_MACHINE:amd-cortexa53-mali-common = "${MACHINE}"

CONTAINER_SHELL = "bash"
