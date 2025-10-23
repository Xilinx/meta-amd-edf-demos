require recipes-extended/images/container-app-base.bb

CONTAINER_APP = " \
	packagegroup-core-base-utils \
	dfx-mgr-client \
	vek280-pl-vdu-fw \
	vdu-ctrlsw \
	libvdu-omxil \
	vdu-firmware \
	kernel-module-vdu \
        "

CONTAINER_APP_CMD = ""

COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"

CONTAINER_SHELL = "bash"
