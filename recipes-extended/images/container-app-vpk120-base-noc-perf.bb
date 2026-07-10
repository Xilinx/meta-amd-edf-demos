require recipes-extended/images/container-app-base.bb

CONTAINER_APP = " \
	packagegroup-core-base-utils \
	fpga-manager-script \
	vpk120-base-noc-perf \
	perf \
	util-linux-dmesg \
	util-linux-mount \
	"

CONTAINER_APP_CMD = "sh -c 'echo -n /lib/firmware/xilinx/vpk120-base-noc-perf > /sys/module/firmware_class/parameters/path 2>/dev/null; exec bash'"

COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"

CONTAINER_SHELL = "bash"
