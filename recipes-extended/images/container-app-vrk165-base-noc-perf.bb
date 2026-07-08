require recipes-extended/images/container-app-base.bb

CONTAINER_APP = " \
	packagegroup-core-base-utils \
	vrk165-base-noc-perf \
	perf \
	util-linux-dmesg \
	"

CONTAINER_APP_CMD = "sh -c 'mkdir -p /sys/kernel/config/device-tree/overlays/vrk165-base-noc-perf 2>/dev/null; cat /lib/firmware/xilinx/vrk165-base-noc-perf/vrk165-base-noc-perf.dtbo > /sys/kernel/config/device-tree/overlays/vrk165-base-noc-perf/dtbo 2>/dev/null; exec bash'"

COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"

CONTAINER_SHELL = "bash"
