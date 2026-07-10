require recipes-extended/images/container-app-base.bb

CONTAINER_APP = " \
	packagegroup-core-base-utils \
	fpga-manager-script \
	vpk120-base-noc-perf \
	perf \
	util-linux-dmesg \
	util-linux-mount \
	"

CONTAINER_APP_CMD = ""

COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"

CONTAINER_SHELL = "bash"
